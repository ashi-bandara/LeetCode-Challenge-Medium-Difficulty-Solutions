# LeetCode Challenge D59

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [570. Managers with at Least 5 Direct Reports](https://leetcode.com/problems/managers-with-at-least-5-direct-reports/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

**Language Used**
> MySQL

**Difficulty**
> Medium

## Solution Overview
This query selects the names of employees (e.name) from the Employee table, where each employee has a manager (e.id = m.managerId) and groups them by their unique identifier (e.id). The HAVING clause ensures that only those managers who have at least five direct reports are included in the result. Essentially, the query identifies managers by their IDs and counts the number of employees they manage. If this count is five or more, the manager's name is selected and returned as part of the result. So, the end result will give a list of managers who oversee five or more employees directly.
