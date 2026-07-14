# 729. My Calendar I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/my-calendar-i/
**Topics:** Array, Binary Search, Design, Segment Tree, Ordered Set

## Problem

You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a **double booking**.

A **double booking** happens when two events have some non-empty intersection (i.e., some moment is common to both events.).

The event can be represented as a pair of integers `startTime` and `endTime` that represents a booking on the half-open interval `[startTime, endTime)`, the range of real numbers `x` such that `startTime <= x < endTime`.

Implement the `MyCalendar` class:

	- `MyCalendar()` Initializes the calendar object.
	- `boolean book(int startTime, int endTime)` Returns `true` if the event can be added to the calendar successfully without causing a **double booking**. Otherwise, return `false` and do not add the event to the calendar.

 

Example 1:

**Input**
["MyCalendar", "book", "book", "book"]
[[], [10, 20], [15, 25], [20, 30]]
**Output**
[null, true, false, true]

**Explanation**
MyCalendar myCalendar = new MyCalendar();
myCalendar.book(10, 20); // return True
myCalendar.book(15, 25); // return False, It can not be booked because time 15 is already booked by another event.
myCalendar.book(20, 30); // return True, The event can be booked, as the first event takes every time less than 20, but not including 20.

 

**Constraints:**

	- `0 <= start < end <= 10^9^`
	- At most `1000` calls will be made to `book`.

## Hints

<details>
<summary>Hint 1</summary>

Store the events as a sorted list of intervals.  If none of the events conflict, then the new event can be added.

</details>

## Similar Questions

- [My Calendar II](https://leetcode.com/problems/my-calendar-ii/) (Medium)
- [My Calendar III](https://leetcode.com/problems/my-calendar-iii/) (Hard)
- [Determine if Two Events Have Conflict](https://leetcode.com/problems/determine-if-two-events-have-conflict/) (Easy)

## Stats
- Runtime: 87 ms (beats 17.77%)
- Memory: 47.2 MB (beats 69.83%)

## Approach

## Complexity
