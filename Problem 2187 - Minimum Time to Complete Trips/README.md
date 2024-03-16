# LeetCode Challenge D65

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2187. Minimum Time to Complete Trips](https://leetcode.com/problems/minimum-time-to-complete-trips/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
You are given an array  `time`  where  `time[i]`  denotes the time taken by the  `ith`  bus to complete  **one trip**.

Each bus can make multiple trips  **successively**; that is, the next trip can start  **immediately after**  completing the current trip. Also, each bus operates  **independently**; that is, the trips of one bus do not influence the trips of any other bus.

You are also given an integer  `totalTrips`, which denotes the number of trips all buses should make  **in total**. Return  _the  **minimum time**  required for all buses to complete  **at least**_ `totalTrips` _trips_.

**Example**
>**Input:** time = [1,2,3], totalTrips = 5
>
>**Output:** 3
>
>**Explanation:**
>
>- At time t = 1, the number of trips completed by each bus are [1,0,0]. 
  The total number of trips completed is 1 + 0 + 0 = 1.
>- At time t = 2, the number of trips completed by each bus are [2,1,0]. 
  The total number of trips completed is 2 + 1 + 0 = 3.
>- At time t = 3, the number of trips completed by each bus are [3,1,1]. 
  The total number of trips completed is 3 + 1 + 1 = 5.
So the minimum time needed for all buses to complete at least 5 trips is 3.

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
The solution employs a binary search algorithm to find the minimum time. Initially, it sorts the array of bus trip times. Then, it sets up a search range between 0 and the maximum possible time that could be taken by any bus to complete all trips. In each iteration, it calculates the total number of trips that could be completed within the current time range. Based on this count compared to the required total trips, it adjusts the search range accordingly until convergence. This approach ensures an optimal solution by efficiently narrowing down the search range and determining the minimum time required for all buses to complete the specified number of trips.
