# Competitive_Coding-3

## Pascal Triangle
Pascal's triangle is a triangular 2-D array of integers which can be constructed from the following points:
•	The first row has th number 1.
•	For each subsequent row, each element is the sum of the numbers directly above it, on either side.
For example, here are the first few rows:
   1



   1 1



  1 2 1



 1 3 3 1



1 4 6 4 1

K is an input, then you have to return the kth row of Pascal's triangle. Do this using O(k) space.

Source Link: https://leetcode.com/problems/pascals-triangle/

## K-diff Pairs in an Array
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i, j < nums.length
i != j
nums[i] - nums[j] == k
Notice that |val| denotes the absolute value of val.

 

Example 1:

Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
Example 2:

Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
Example 3:

Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Leet Code: https://leetcode.com/problems/k-diff-pairs-in-an-array/