
# LeetCode Challenge D51
## Achievements
[![image.png](https://i.postimg.cc/3NSzzcsy/image.png)](https://postimg.cc/WqZ9kXbj)
This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [73. Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given an  `m x n`  integer matrix  `matrix`, if an element is  `0`, set its entire row and column to  `0`'s.

You must do it  [in place](https://en.wikipedia.org/wiki/In-place_algorithm).


**Example**
>
![](https://assets.leetcode.com/uploads/2020/08/17/mat1.jpg)
>**Input:** matrix = [[1,1,1],[1,0,1],[1,1,1]]
>**Output:** [[1,0,1],[0,0,0],[1,0,1]]

**Language Used**
> MySQL

**Difficulty**
> Medium

## Solution Overview
The provided solution addresses the task of setting entire rows and columns to zero if a zero element is encountered in a given matrix. It employs two ArrayLists to store the indices of rows and columns containing zeros. First, it iterates through the matrix to identify zero elements, storing their corresponding row and column indices in separate lists. Then, it traverses these lists and sets the entire rows to zero using the `setRowZero` method and entire columns to zero using the `setColumnZero` method. This approach ensures that all rows and columns with zero elements are correctly modified in place within the original matrix, fulfilling the requirement to perform the operation without using additional space. However, this solution has a time complexity of O(m * n * (m + n)), where m and n represent the number of rows and columns in the matrix, respectively, making it inefficient for large matrices with many zero elements.
