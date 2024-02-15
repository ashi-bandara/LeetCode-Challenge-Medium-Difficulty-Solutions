
# LeetCode Challenge D54


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [547. Number of Provinces](https://leetcode.com/problems/number-of-provinces/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution. 

## Problem Statement

There are  `n`  cities. Some of them are connected, while some are not. If city  `a`  is connected directly with city  `b`, and city  `b`  is connected directly with city  `c`, then city  `a`  is connected indirectly with city  `c`.

A  **province**  is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an  `n x n`  matrix  `isConnected`  where  `isConnected[i][j] = 1`  if the  `ith`  city and the  `jth`  city are directly connected, and  `isConnected[i][j] = 0`  otherwise.

Return  _the total number of  **provinces**_.

**Example**

![](https://assets.leetcode.com/uploads/2020/12/24/graph1.jpg)

>**Input:** isConnected = [[1,1,0],[1,1,0],[0,0,1]]
>**Output:** 2

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
The solution works by systematically exploring the connections between cities to identify distinct provinces. Initially, it sets up a counter to keep track of the number of provinces found. Then, it begins traversing through each city, checking if it has been visited. If a city hasn't been visited, it marks it as the start of a new province and initiates a depth-first search (DFS) to explore all cities connected to it. During the DFS traversal, each connected city is marked as visited, ensuring that all cities within the same province are accounted for. This process continues until all cities have been visited and grouped into provinces. Finally, the solution returns the count of provinces found, providing an accurate representation of the total number of distinct provinces present in the given matrix of city connections.

In simpler terms, imagine each city as a point on a map, and the connections between cities as roads. The solution methodically travels along these roads, starting from one city and branching out to others that are directly or indirectly connected. It keeps track of which cities it has visited to avoid counting the same province multiple times. By the end of its journey, it has identified all distinct provinces, each containing a group of cities connected to one another. This approach ensures that no province is overlooked and provides a clear count of how many provinces exist within the network of city connections.
