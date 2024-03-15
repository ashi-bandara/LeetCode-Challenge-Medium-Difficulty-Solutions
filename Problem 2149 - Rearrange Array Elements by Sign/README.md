 

# LeetCode Challenge D64
## Achievements


<p align="center">
  <img src="https://i.postimg.cc/PJBC0RYq/image.png">
</p>


This solution outperformed 100% of Java users on LeetCode according to runtime metrics and 57.31% according to memory metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2149. Rearrange Array Elements by Sign](https://leetcode.com/problems/rearrange-array-elements-by-sign/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
You are given a  **0-indexed**  integer array  `nums`  of  **even**  length consisting of an  **equal**  number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

1.  Every  **consecutive pair**  of integers have  **opposite signs**.
2.  For all integers with the same sign, the  **order**  in which they were present in  `nums`  is  **preserved**.
3.  The rearranged array begins with a positive integer.

Return  _the modified array after rearranging the elements to satisfy the aforementioned conditions_.
**Note**  that:
-   A number greater than  `1`  is called  **prime**  if it is divisible by only  `1`  and itself.
-   An integer  `val1`  is a factor of another integer  `val2`  if  `val2 / val1`  is an integer.

**Example**
>**Input:** nums = [3,1,-2,-5,2,-4]
>
>**Output:** [3,-2,1,-5,2,-4]
>
>**Explanation:**
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview

This solution rearranges an array containing both positive and negative integers so that positive and negative numbers alternate in the resulting array. It achieves this by iterating through each number in the input array. If a number is positive, it is placed at every other position (even indices) in the new array, starting from the first position (index 0). Similarly, if a number is negative, it is placed at every other position (odd indices) in the new array, starting from the second position (index 1). This process ensures that positive and negative numbers alternate in the new array, adhering to the specified conditions.
