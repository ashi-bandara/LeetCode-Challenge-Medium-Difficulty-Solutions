
# LeetCode Challenge D58
## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [435. Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given an array of intervals  `intervals`  where  `intervals[i] = [starti, endi]`, return  _the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping_.

**Example**
>**Input:** intervals = [[1,2],[2,3],[3,4],[1,3]]
>**Output:** 1
>**Explanation:** [1,3] can be removed and the rest of the intervals are non-overlapping.

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
The solution begins by sorting the intervals based on their end times, a critical step that allows for efficient traversal and comparison. This sorting is facilitated by employing the `Arrays.sort` method with a custom comparator, streamlining the process.

Once the intervals are sorted, the algorithm iterates through them, tracking the count of non-overlapping intervals encountered. It does so by comparing the start time of each interval with the end time of the previous non-overlapping interval. Whenever it finds an interval whose start time is greater than or equal to the end time of the previous one, it increments the count of non-overlapping intervals and updates the reference to the previous interval accordingly.

By the end of the traversal, the algorithm has effectively identified the minimum number of intervals that need removal to ensure non-overlapping intervals throughout the array. This is achieved by subtracting the count of non-overlapping intervals from the total number of intervals in the array.
