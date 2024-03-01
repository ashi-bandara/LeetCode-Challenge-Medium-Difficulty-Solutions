
# LeetCode Challenge D61
## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [378. Kth Smallest Element in a Sorted Matrix](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given an  `n x n`  `matrix`  where each of the rows and columns is sorted in ascending order, return  _the_  `kth`  _smallest element in the matrix_.

Note that it is the  `kth`  smallest element  **in the sorted order**, not the  `kth`  **distinct**  element.

**Example**
>**Input:** matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
>
>**Output:** 13
>
>**Explanation:** The elements in the matrix are [1,5,9,10,11,12,13,**13**,15], and the 8th smallest number is 13

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
In the solution, the matrix is traversed row by row, and each element is added to a 1D list called `fullList`. This list essentially contains all the elements of the matrix flattened into a single list. After all elements are added, the `Collections.sort()` method is used to sort this list in ascending order. Finally, the kth smallest element is retrieved from the sorted list using `fullList.get(k-1)` and returned as the result.
