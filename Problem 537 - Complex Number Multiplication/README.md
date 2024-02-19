
# LeetCode Challenge D56

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [537. Complex Number Multiplication](https://leetcode.com/problems/complex-number-multiplication/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
A  [complex number](https://en.wikipedia.org/wiki/Complex_number)  can be represented as a string on the form  `"**real**+**imaginary**i"`  where:

-   `real`  is the real part and is an integer in the range  `[-100, 100]`.
-   `imaginary`  is the imaginary part and is an integer in the range  `[-100, 100]`.
-   `i2 == -1`.

Given two complex numbers  `num1`  and  `num2`  as strings, return  _a string of the complex number that represents their multiplications_.

**Example**
>**Input:** num1 = "1+1i", num2 = "1+1i"
>
>**Output:** "0+2i"
>
>**Explanation:** (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.

**Language Used**
> Java

**Difficulty**
> Medium

## Solution Overview
The solution tackles the multiplication of two complex numbers represented as strings by employing a systematic approach. Initially, the method `complexNumberMultiply` splits each input string into its real and imaginary parts using the `split("\\+")` method, where the "+" sign is escaped to correctly identify it as a delimiter. This step facilitates the isolation of the numerical components required for computation.

Following the parsing phase, the real and imaginary parts are converted from strings to integers using `Integer.valueOf()`, enabling arithmetic operations. The real and imaginary components of each complex number are stored in separate variables for subsequent calculations. Specifically, the multiplication process entails applying the standard formula for complex number multiplication: (a + bi) * (c + di) = (ac - bd) + (ad + bc)i.

In the final step, the solution computes the real and imaginary components of the resulting complex number using these formulae and concatenates them into a single string in the specified format: "real+imaginaryi". This formatted string is then returned as the output of the method, providing a clear representation of the multiplication outcome. 


