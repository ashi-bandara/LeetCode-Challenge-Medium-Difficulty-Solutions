
# LeetCode Challenge D55

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2195. Append K Integers With Minimal Sum](https://leetcode.com/problems/append-k-integers-with-minimal-sum/) Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
You are given an integer array  `nums`  and an integer  `k`. Append  `k`  **unique positive**  integers that do  **not**  appear in  `nums`  to  `nums`  such that the resulting total sum is  **minimum**.

Return _the sum of the_  `k`  _integers appended to_  `nums`.

**Example**
>**Input:** nums = [1,4,25,10,25], k = 2
> 
>**Output:** 5
>
>**Explanation:** The two unique positive integers that do not appear in nums which we append are 2 and 3.
The resulting sum of nums is 1 + 4 + 25 + 10 + 25 + 2 + 3 = 70, which is the minimum.
The sum of the two integers appended is 2 + 3 = 5, so we return 5.

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
Despite its simplicity, the problem is challenging due to time constraints. The solution addresses the problem of appending `k` unique positive integers to an array `nums` such that the resulting total sum is minimum. To achieve this, the algorithm iterates through the sorted `nums` array and selects unique numbers less than or equal to `k`. It uses a HashSet to keep track of selected numbers to ensure uniqueness. The condition `num <= k` is crucial as it ensures that only numbers within the range of `1` to `k` are considered for appending, aligning with the requirement of adding positive integers. By incrementing `k` each time a number is appended, the algorithm ensures that exactly `k` unique positive integers are added to `nums`. Finally, it calculates the sum of the appended integers and returns it as the result.

