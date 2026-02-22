#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 14:16:29 2026

@author: rishigoswamy

    LeetCode 118: Pascal's Triangle
    Link: https://leetcode.com/problems/pascals-triangle/

    Approach:
    Build the triangle row by row.

    Observations:
        - First and last elements of every row are 1.
        - For any middle element:
              triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]

    Steps:
        1. Iterate from row 0 to numRows-1.
        2. Initialize each row with all 1s.
        3. Fill middle values using previous row.
        4. Append row to result.

    // Time Complexity : O(n^2)
        Total elements generated ≈ n(n+1)/2.
    // Space Complexity : O(n^2)
        Output storage for triangle.
"""

from typing import List

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []

        for i in range(0, numRows):
            temp = [1] * (i+1)

            for j in range(1, i):
                temp[j] = res[i-1][j-1] + res[i-1][j]
            
            res.append(temp)
        
        return res