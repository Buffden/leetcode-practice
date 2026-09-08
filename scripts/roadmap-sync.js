#!/usr/bin/env node

const fs = require("fs");
const path = require("path");

const ROOT = path.resolve(__dirname, "..");
const PLAN_PATH = path.join(ROOT, "roadmap", "plan.json");
const COMPANY_PATH = path.join(ROOT, "roadmap", "company-focus.json");
const STATUS_PATH = path.join(ROOT, "roadmap", "REPO_STATUS.md");

const ROADMAP_START = "<!-- ROADMAP:START -->";
const ROADMAP_END = "<!-- ROADMAP:END -->";

function readJson(file) {
  return JSON.parse(fs.readFileSync(file, "utf8"));
}

function getArg(name, fallback = null) {
  const idx = process.argv.indexOf(name);
  return idx >= 0 && process.argv[idx + 1] ? process.argv[idx + 1] : fallback;
}

function walk(dir, result = []) {
  for (const entry of fs.readdirSync(dir, { withFileTypes: true })) {
    if ([".git", "node_modules", "roadmap", "scripts", ".github"].includes(entry.name)) continue;
    const full = path.join(dir, entry.name);
    if (entry.isDirectory()) walk(full, result);
    else result.push(full);
  }
  return result;
}

function problemReadmes() {
  return walk(ROOT).filter((file) => {
    const rel = path.relative(ROOT, file).split(path.sep).join("/");
    return /^[^/]+\/\d+-[^/]+\/README\.md$/.test(rel);
  });
}

function slugFromReadme(file) {
  return path.basename(path.dirname(file)).replace(/^\d+-/, "");
}

function extractManualSection(content) {
  const match = content.match(/\n## Approach\b/);
  if (!match || match.index == null) return null;
  return content.slice(match.index + 1).trimEnd() + "\n";
}

function restoreManualSection(content, manual) {
  if (!manual) return content;
  const match = content.match(/\n## Approach\b/);
  if (!match || match.index == null) {
    return content.trimEnd() + "\n\n" + manual;
  }
  return content.slice(0, match.index + 1) + manual;
}

function removeRoadmapBlock(content) {
  const start = content.indexOf(ROADMAP_START);
  if (start < 0) return content;
  const end = content.indexOf(ROADMAP_END, start);
  if (end < 0) return content;
  const after = end + ROADMAP_END.length;
  return (content.slice(0, start).trimEnd() + "\n\n" + content.slice(after).trimStart()).trimEnd() + "\n";
}

function roadmapBlock(entry, companyMatches) {
  const companies = companyMatches.length ? companyMatches.join(", ") : "None in current target-company snapshot";
  const companyFocus = entry.companyFocus && entry.companyFocus.length
    ? entry.companyFocus.join(", ")
    : "Pattern mastery first; company targeting begins in Weeks 7–8";

  return [
    ROADMAP_START,
    "## Interview Prep",
    "",
    `- **Sprint:** Week ${entry.week}, Day ${entry.day}`,
    `- **Baseline:** ${entry.baselineMode} — ${entry.baselineMode === "RELEARN" ? "historical accepted solution exists; perform a cold re-solve" : "not present in repo at roadmap start"}`,
    `- **Priority:** ${entry.priority}`,
    `- **Focus:** ${entry.focus}`,
    "- **Curriculum pool:** merged NeetCode 150 + Blind 75 + LeetCode Top Interview 150 (not three separate completion lists)",
    `- **Week company focus:** ${companyFocus}`,
    `- **Target-company matches in snapshot:** ${companies}`,
    "- **Review cadence:** D+1 → D+3 → D+7 → D+14 → D+30",
    "- **Postmortem codes:** PR / BF / OP / IMP / BUG / EDGE / TC / RET / COM / TIME",
    "",
    ROADMAP_END
  ].join("\n");
}

function injectBlock(content, block) {
  content = removeRoadmapBlock(content);
  const anchors = ["\n## Problem", "\n## Stats", "\n## Approach"];
  let idx = -1;
  for (const anchor of anchors) {
    idx = content.indexOf(anchor);
    if (idx >= 0) break;
  }
  if (idx < 0) return content.trimEnd() + "\n\n" + block + "\n";
  return content.slice(0, idx).trimEnd() + "\n\n" + block + "\n" + content.slice(idx).trimStart();
}

function snapshot(outputPath) {
  const notes = {};
  for (const file of problemReadmes()) {
    const manual = extractManualSection(fs.readFileSync(file, "utf8"));
    if (manual) notes[slugFromReadme(file)] = manual;
  }
  fs.writeFileSync(outputPath, JSON.stringify(notes, null, 2) + "\n");
  console.log(`Saved manual sections for ${Object.keys(notes).length} problems to ${outputPath}`);
}

function generateRepoStatus(plan, existingSlugs, companyMap) {
  const lines = [
    "# Roadmap Repository Status",
    "",
    "> Auto-generated. This records whether a solution exists in the repository. **It is not a mastery score.** Use [PROGRESS.md](./PROGRESS.md) for interview readiness.",
    "",
    `Generated from the current working tree. Roadmap size: **${plan.problems.length} problems**.`,
    ""
  ];

  for (const week of plan.weeks) {
    const problems = plan.problems.filter((p) => p.week === week.week);
    const present = problems.filter((p) => existingSlugs.has(p.slug)).length;
    lines.push(`## Week ${week.week} — ${week.focus}`);
    lines.push("");
    lines.push(`Repo coverage: **${present}/${problems.length}**`);
    lines.push("");
    lines.push("| Day | Problem | Baseline | Repo solution | Target-company snapshot |");
    lines.push("|---:|---|---|---|---|");
    for (const p of problems) {
      const exists = existingSlugs.has(p.slug) ? "✅ exists" : "⬜ not yet synced";
      const companies = (companyMap[p.slug] || []).join(", ") || "—";
      lines.push(`| ${p.day} | [${p.title}](${p.url}) | ${p.baselineMode} | ${exists} | ${companies} |`);
    }
    lines.push("");
  }

  const totalPresent = plan.problems.filter((p) => existingSlugs.has(p.slug)).length;
  lines.splice(5, 0, `Current roadmap repo coverage: **${totalPresent}/${plan.problems.length}**. Again, coverage is not mastery.`, "");
  return lines.join("\n") + "\n";
}

function enrich(snapshotPath) {
  const plan = readJson(PLAN_PATH);
  const companyMap = readJson(COMPANY_PATH);
  const bySlug = new Map(plan.problems.map((p) => [p.slug, p]));

  let notes = {};
  if (snapshotPath && fs.existsSync(snapshotPath)) {
    notes = readJson(snapshotPath);
  }

  let changed = 0;
  const existingSlugs = new Set();

  for (const file of problemReadmes()) {
    const slug = slugFromReadme(file);
    existingSlugs.add(slug);
    const entry = bySlug.get(slug);

    const original = fs.readFileSync(file, "utf8");
    let next = restoreManualSection(original, notes[slug]);
    if (entry) {
      next = injectBlock(next, roadmapBlock(entry, companyMap[slug] || []));
    }

    if (next !== original) {
      fs.writeFileSync(file, next);
      changed++;
    }
  }

  fs.writeFileSync(STATUS_PATH, generateRepoStatus(plan, existingSlugs, companyMap));
  console.log(`Enriched ${changed} roadmap problem READMEs and regenerated roadmap/REPO_STATUS.md`);
}

const command = process.argv[2];
if (command === "snapshot") {
  const output = getArg("--output", path.join(process.env.RUNNER_TEMP || "/tmp", "leetcode-manual-notes.json"));
  snapshot(output);
} else if (command === "enrich") {
  enrich(getArg("--snapshot"));
} else {
  console.error("Usage: node scripts/roadmap-sync.js snapshot [--output file] | enrich [--snapshot file]");
  process.exit(1);
}
