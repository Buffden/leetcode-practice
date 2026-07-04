# LeetCode Practice

My personal LeetCode solutions in Java, automatically synced and organized by DSA pattern.

## Folder Structure

Solutions are organized by algorithmic pattern, then by problem:

```
<pattern>/
└── <number>-<problem-slug>/
    ├── README.md        ← problem details, difficulty, topics, runtime stats
    └── <slug>-solution.java
```

### Patterns

| Folder | Description |
|---|---|
| `sliding-window` | Fixed and variable size window problems |
| `two-pointers` | Left/right pointer traversal |
| `divide-and-conquer` | Recursive problem splitting |
| `topological-sort` | Ordering with dependencies |
| `union-find` | Disjoint set problems |
| `monotonic-stack` | Next greater/smaller element |
| `monotonic-queue` | Sliding window maximum/minimum |
| `prefix-sum` | Cumulative sum queries |
| `backtracking` | Exhaustive search with pruning |
| `shortest-path` | Dijkstra, Bellman-Ford |
| `minimum-spanning-tree` | Kruskal, Prim |
| `dynamic-programming` | Optimal substructure problems |
| `greedy` | Locally optimal choice problems |
| `binary-search` | Search on sorted space |
| `breadth-first-search` | Level-order traversal |
| `depth-first-search` | Recursive/stack-based traversal |
| `bit-manipulation` | Bitwise operation tricks |
| `heap-priority-queue` | Top-K, median stream problems |
| `trie` | Prefix tree problems |
| `stack` | LIFO structure problems |
| `linked-list` | Pointer manipulation |
| `binary-search-tree` | BST properties |
| `hash-table` | Key-value lookup problems |
| `string` | String manipulation |
| `tree` | General tree problems |
| `graph` | General graph problems |
| `array` | Array manipulation |
| `uncategorized` | Problems with no matching pattern tag |

## Sync

Solutions are automatically committed via [leetcode-sync](https://github.com/Buffden/leetcode-sync) on every new accepted submission.

Each problem's `README.md` contains:
- Problem title, number, difficulty, and link
- Topics/tags
- Runtime and memory percentile stats
- `## Approach` and `## Complexity` sections (filled in manually)
