
# LeetCode Challenge D60
## Achievements
[![image.png](https://i.postimg.cc/nhrP1zV1/image.png)](https://postimg.cc/xXr5f9zk)

This solution outperformed 99.78% of Java users on LeetCode according to runtime metrics and 96.16% according to memory metrics.
 

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [1423. Maximum Points You Can Obtain from Cards](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
There are several cards  **arranged in a row**, and each card has an associated number of points. The points are given in the integer array  `cardPoints`.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly  `k`  cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array  `cardPoints`  and the integer  `k`, return the  _maximum score_  you can obtain.

**Example**
>**Input:** cardPoints = [1,2,3,4,5,6,1], k = 3
>
>**Output:** 12
>
>**Explanation:** After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
This solution aims to find the maximum score achievable by selecting a specific number of cards from either end of a row of cards. It begins by calculating the sum of points from the first `k` cards, representing a window starting from the beginning of the array. This sum serves as the initial score. Then, employing a sliding window approach, it iteratively adjusts the window by removing one card from the left side and adding one from the right side, simulating the process of selecting cards. The maximum score is updated whenever a higher sum is obtained during this process.  
