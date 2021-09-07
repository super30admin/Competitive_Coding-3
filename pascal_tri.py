#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Sep  6 18:55:54 2021

@author: ameeshas11
"""


#Time Complexity : O(n)
#Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


class Solution:
    def gen_list(self, n, prev):
        if n == 0:
            return [1]
        else:
            li = [1]*(n+1)
            if n>1:
                for i in range(1, n):
                    li[i] = prev[i-1] + prev[i]
            return li
        
    def generate(self, numRows: int) -> List[List[int]]:
        
        li = prev_li = []
        count = 0
        output = []
        
        while count != numRows:
            li = self.gen_list(count, prev_li)
            prev_li = li
            output.append(li)
            count+=1
            
        return output