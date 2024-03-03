
# LeetCode Challenge D62
## Achievements


<p align="center">
  <img src="https://i.postimg.cc/XJ3BnQZn/image.png">
</p>


This solution outperformed 91.12% of Java users on LeetCode according to runtime metrics and 53.27% according to memory metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2521. Distinct Prime Factors of Product of Array](https://leetcode.com/problems/distinct-prime-factors-of-product-of-array/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

Given an array of positive integers  `nums`, return  _the number of  **distinct prime factors**  in the product of the elements of_  `nums`.

**Note**  that:
-   A number greater than  `1`  is called  **prime**  if it is divisible by only  `1`  and itself.
-   An integer  `val1`  is a factor of another integer  `val2`  if  `val2 / val1`  is an integer.

**Example**
>**Input:** nums = [2,4,3,7,10,6]
>
>**Output:** 4
>
>**Explanation:**
The product of all the elements in nums is: 2 * 4 * 3 * 7 * 10 * 6 = 10080 = 25 * 32 * 5 * 7.
There are 4 distinct prime factors so we return 4.

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
The solution iterates through each number in the array and performs prime factorization on each one. To efficiently identify prime factors, the loop iterates up to the square root of the current number `num`, leveraging the condition `i * i <= num`.

This optimization enhances efficiency by avoiding the need to compute the square root using `Math.sqrt(num)` for every iteration, especially advantageous for larger numbers. It also ensures accuracy since comparing `i * i` directly with `num` avoids potential floating-point precision issues associated with using `Math.sqrt(num)`.

Within the loop, if `num` is divisible by `i`, the solution continuously divides `num` by `i` until it's no longer divisible, adding `i` to the set of prime factors each time. After completing the prime factorization for a given `num`, if `num` is greater than 1, it signifies that `num` itself is a prime number, so it's added to the set of prime factors as well.
