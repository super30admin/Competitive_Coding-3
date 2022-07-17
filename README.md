# Competitive_Coding-3
#Stitch Fix
Source Link : https://leetcode.com/problems/pascals-triangle/

Git Link : https://github.com/super30admin/Competitive_Coding-3
Problem Statement
Pascal's triangle is a triangular 2-D array of integers which can be constructed from the following points:

The first row has th number 1.
For each subsequent row, each element is the sum of the numbers directly above it, on either side.
For example, here are the first few rows:
1


   1 1


  1 2 1


 1 3 3 1


1 4 6 4 1
K is an input, then you have to return the kth row of Pascal's triangle. Do this using O(k) space.

Intuit
Source Link : https://leetcode.com/problems/k-diff-pairs-in-an-array/
Git Link : https://github.com/super30admin/Competitive_Coding-3
Problem Statement
You are given an integer array and a value k, you have to search for the unique k different pairs in this array .

we define k different pairs as an integer pair (i,j), where i and j are the numbers in the given array only whose absolute difference is k.

Keep in mind that the pairs (i,j) and (j,i) are conted as same pair and the length of the array will not exceed 10,000. also all the integer values belong to the range [-1e7,1e7]

Example 1:

Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
Example 2:

Input: [1, 3, 1, 5, 4, 8], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
