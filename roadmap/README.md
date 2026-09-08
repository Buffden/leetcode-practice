# 8-Week DSA Interview Roadmap

This repository is the execution system for the 8-week interview sprint. The goal is not to "finish LeetCode"; it is to make pattern recognition, brute-force derivation, optimization, Java implementation, testing, complexity analysis, and explanation reliable under interview time pressure.

## Target

- **Timeline:** 8 weeks
- **Language:** Java
- **Sprint load:** ~3 hours/day
- **Target level:** SDE I / early-career SWE interviews
- **Priority companies:** Amazon/AWS, Google, Meta, Apple; transferable to other high-paying product companies
- **Curriculum pool:** NeetCode 150 + Blind 75 + LeetCode Top Interview 150 + company-targeted reinforcement
- **Important:** these lists are merged into one curriculum. Do **not** solve all three lists independently.

## What counts as progress

A solution existing in this repository only means it was accepted at some point. It does **not** mean the problem is interview-ready.

The roadmap therefore uses two baseline modes:

- **RELEARN** — already exists in the repo; solve cold again and rebuild retrieval.
- **NEW** — not present in the repo at roadmap start.

Mastery is tracked separately in [PROGRESS.md](./PROGRESS.md).

## 3-hour daily block

| Block | Time | Purpose |
|---|---:|---|
| Retrieval warm-up | 25 min | Recall an old problem without notes |
| Problem 1 | 55 min | Main Medium / pattern problem |
| Problem 2 | 50 min | Second problem or pattern variation |
| Spaced re-solve | 30 min | D+1 / D+3 / D+7 / D+14 / D+30 review |
| Postmortem + notes | 20 min | Error codes, invariant, complexity, edge cases |

For each fresh problem:

1. Clarify constraints and edge cases.
2. State a correct brute-force approach.
3. Identify repeated work / exploitable structure.
4. Derive the optimized approach.
5. State time and space complexity **before** coding.
6. Implement in Java.
7. Dry-run representative and boundary cases.
8. Log the failure mode if the solve was not clean.

## Error codes

| Code | Meaning |
|---|---|
| `PR` | Pattern recognition failure |
| `BF` | Could not derive brute force |
| `OP` | Could not optimize |
| `IMP` | Knew approach but could not implement |
| `BUG` | Coding bug |
| `EDGE` | Missed edge case |
| `TC` | Wrong time/space complexity |
| `RET` | Forgot previously learned pattern |
| `COM` | Could not explain clearly |
| `TIME` | Too slow |

## Weekly curriculum

| Week | Focus | Problems | Special emphasis |
|---:|---|---:|---|
| 1 | Arrays, Hashing, Two Pointers, Sliding Window, Prefix Sum | 12 | Pattern mastery |
| 2 | Binary Search, Linked Lists, Stack, Monotonic Stack | 12 | Pattern mastery |
| 3 | Trees, BST, DFS, BFS, Recursive Invariants | 12 | Pattern mastery |
| 4 | Heap, Intervals, Greedy, Trie | 12 | Pattern mastery |
| 5 | Graphs, BFS/DFS, Union Find, Topological Sort, Shortest Path, MST | 12 | Pattern mastery |
| 6 | Backtracking, 1D DP, 2D DP | 12 | Pattern mastery |
| 7 | Mixed Interview Set + High-Yield Design/Data-Structure Problems | 12 | Amazon, Google, Meta, Apple |
| 8 | Timed Mixed Problems, Selected Hards, Weak-Topic Repair | 12 | Amazon, Google, Meta, Apple |

**Sunday rule:** no mandatory new problems. Use Sunday for spaced repetition, error-log review, weak-topic repair, and one 45-minute timed mock.

## Spaced repetition

Every MUST_KNOW problem follows:

**D+1 → D+3 → D+7 → D+14 → D+30**

A review does not always require writing the full solution:

- **Recall:** identify pattern + invariant + algorithm + complexity.
- **Skeleton:** write the core state, loop/recursion, and transitions.
- **Full solve:** code from scratch with no notes.

Problems with `PR`, `IMP`, `BUG`, or `RET` should receive more full re-solves.

## Repository automation

The LeetCode sync remains the ingestion layer. The roadmap layer adds personal interview-prep metadata without turning the reusable sync action into a user-specific planning tool.

After the LeetCode sync runs, the roadmap enrichment step:

1. preserves manual `## Approach` / `## Complexity` / interview notes,
2. refreshes the repository from the newly synced commit,
3. injects roadmap metadata into problems that belong to the 8-week plan,
4. regenerates [REPO_STATUS.md](./REPO_STATUS.md),
5. commits only the roadmap-derived changes.

This separation means:
- **leetcode-sync** = accepted-submission ingestion and generic metadata,
- **leetcode-practice** = your curriculum, mastery tracking, spaced repetition, and company focus.

## Company targeting

Weeks 7–8 explicitly emphasize Amazon, Google, Meta, and Apple. The file [company-focus.json](./company-focus.json) is derived from the existing company-tag dataset in `Buffden/leetcode-sync` and only records matches for those four target companies.

Treat company tags as prioritization evidence, not proof that a question will be asked.

## Files

- [plan.json](./plan.json) — machine-readable 96-problem curriculum.
- [PROGRESS.md](./PROGRESS.md) — human mastery/review tracker; automation does not overwrite it.
- [REPO_STATUS.md](./REPO_STATUS.md) — auto-generated "solution exists in repo" status.
- [company-focus.json](./company-focus.json) — Amazon/Google/Meta/Apple matches for roadmap problems.

