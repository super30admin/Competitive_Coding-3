#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 14:18:19 2026

@author: rishigoswamy

    LeetCode 532: K-diff Pairs in an Array
    Link: https://leetcode.com/problems/k-diff-pairs-in-an-array/

    Approach:
    Use a frequency hashmap.

    Case 1: k == 0
        We are looking for numbers that appear more than once.
        Each number with frequency > 1 contributes exactly one pair.

    Case 2: k > 0
        For each unique number x,
        check whether (x + k) exists in the map.

    Important:
        We use unique keys to avoid duplicate pair counting.

    // Time Complexity : O(n)
        Build hashmap in O(n)
        Iterate unique keys in O(n)
    // Space Complexity : O(n)
        Hashmap storage
"""

from typing import List
from collections import defaultdict

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hMap = defaultdict(int)
        for num in nums:
            hMap[num] += 1
        
        count = 0
        if k == 0:
            for key in hMap:
                if hMap[key] > 1:
                    count+=1
            return count
        
        for key in hMap:
            if k + key in hMap:
                count+=1
        
        return count
