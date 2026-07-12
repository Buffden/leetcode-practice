# 1028. Interval List Intersections

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/interval-list-intersections/
**Topics:** Array, Two Pointers, Sweep Line

## Problem

You are given two lists of closed intervals, `firstList` and `secondList`, where `firstList[i] = [starti, endi]` and `secondList[j] = [startj, endj]`. Each list of intervals is pairwise **disjoint** and in **sorted order**.

Return *the intersection of these two interval lists*.

A **closed interval** `[a, b]` (with `a <= b`) denotes the set of real numbers `x` with `a <= x <= b`.

The **intersection** of two closed intervals is a set of real numbers that are either empty or represented as a closed interval. For example, the intersection of `[1, 3]` and `[2, 4]` is `[2, 3]`.

 

Example 1:

**Input:** firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
**Output:** [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]

Example 2:

**Input:** firstList = [[1,3],[5,9]], secondList = []
**Output:** []

 

**Constraints:**

	- `0 <= firstList.length, secondList.length <= 1000`
	- `firstList.length + secondList.length >= 1`
	- `0 <= starti < endi <= 10^9^`
	- `endi < starti+1`
	- `0 <= startj < endj <= 10^9^ `
	- `endj < startj+1`

## Similar Questions

- [Merge Intervals](https://leetcode.com/problems/merge-intervals/) (Medium)
- [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) (Easy)
- [Employee Free Time](https://leetcode.com/problems/employee-free-time/) (Hard)
- [Maximum Matching of Players With Trainers](https://leetcode.com/problems/maximum-matching-of-players-with-trainers/) (Medium)

## Stats
- Runtime: 4 ms (beats 49.29%)
- Memory: 47.3 MB (beats 78.09%)

## Approach

## Complexity
