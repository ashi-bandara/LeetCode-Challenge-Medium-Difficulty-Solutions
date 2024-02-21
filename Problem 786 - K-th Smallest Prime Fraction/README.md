
# LeetCode Challenge D57

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [786. K-th Smallest Prime Fraction](https://leetcode.com/problems/k-th-smallest-prime-fraction/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

You are given a sorted integer array  `arr`  containing  `1`  and  **prime**  numbers, where all the integers of  `arr`  are unique. You are also given an integer  `k`.

For every  `i`  and  `j`  where  `0 <= i < j < arr.length`, we consider the fraction  `arr[i] / arr[j]`.

Return  _the_  `kth`  _smallest fraction considered_. Return your answer as an array of integers of size  `2`, where  `answer[0] == arr[i]`  and  `answer[1] == arr[j]`.

**Example**
>**Input:** arr = [1,2,3,5], k = 3
>
>**Output:** [2,5]
>
>**Explanation:** The fractions to be considered in sorted order are:
1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
The third fraction is 2/5.

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
The solution generates all possible fractions by considering each pair of numbers in the given sorted array. It accomplishes this by iterating through the array with nested loops, ensuring that every valid pair of numbers is examined. For each pair, the code calculates the corresponding fraction and stores it, along with the pair of numbers, in separate arrays. This strategy ensures that all fractions are accounted for and associated with their respective pairs.

After generating the fractions, the code sorts them in ascending order. This sorting step is crucial for identifying the kth smallest fraction. Once the fractions are sorted, the code retrieves the kth smallest fraction and determines the pair of numbers associated with it. Finally, it returns this pair of numbers as the result. 
