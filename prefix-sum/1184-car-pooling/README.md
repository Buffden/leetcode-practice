# 1184. Car Pooling

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/car-pooling/
**Topics:** Array, Sorting, Heap (Priority Queue), Simulation, Prefix Sum

## Problem

There is a car with `capacity` empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west).

You are given the integer `capacity` and an array `trips` where `trips[i] = [numPassengersi, fromi, toi]` indicates that the `i^th^` trip has `numPassengersi` passengers and the locations to pick them up and drop them off are `fromi` and `toi` respectively. The locations are given as the number of kilometers due east from the car's initial location.

Return `true`* if it is possible to pick up and drop off all passengers for all the given trips, or *`false`* otherwise*.

 

Example 1:

**Input:** trips = [[2,1,5],[3,3,7]], capacity = 4
**Output:** false

Example 2:

**Input:** trips = [[2,1,5],[3,3,7]], capacity = 5
**Output:** true

 

**Constraints:**

	- `1 <= trips.length <= 1000`
	- `trips[i].length == 3`
	- `1 <= numPassengersi <= 100`
	- `0 <= fromi < toi <= 1000`
	- `1 <= capacity <= 10^5^`

## Hints

<details>
<summary>Hint 1</summary>

Sort the pickup and dropoff events by location, then process them in order.

</details>

## Similar Questions

- [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) (Medium)

## Stats
- Runtime: 1 ms (beats 100.00%)
- Memory: 46.5 MB (beats 26.53%)

## Approach

## Complexity
