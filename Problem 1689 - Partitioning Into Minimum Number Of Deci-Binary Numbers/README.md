
# LeetCode Challenge D52

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [1689. Partitioning Into Minimum Number Of Deci-Binary Numbers](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

A decimal number is called  **deci-binary**  if each of its digits is either  `0`  or  `1`  without any leading zeros. For example,  `101`  and  `1100`  are  **deci-binary**, while  `112`  and  `3001`  are not.

Given a string  `n`  that represents a positive decimal integer, return  _the  **minimum**  number of positive  **deci-binary**  numbers needed so that they sum up to_ `n`_._

**Example**
>**Input:** n = "32"
>**Output:** 3
>**Explanation:** 10 + 11 + 11 = 32

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
The solution proposed for the problem of determining the minimum number of positive deci-binary numbers needed to sum up to a given positive decimal integer is straightforward and efficient. The approach, encapsulated in the provided Java class, iterates through each digit of the input number to find the maximum digit. This maximum digit serves as the key, as it directly corresponds to the minimum number of deci-binary numbers required to represent the original decimal integer. By returning this maximum digit, the algorithm elegantly solves the problem with a time complexity of O(n), where n represents the length of the input number. This simple yet effective solution offers a clear and concise approach to solving the specified task, providing users with a reliable method to determine the minimum deci-binary numbers necessary to achieve the desired sum.
