"""
Time Complexity :O(N^2), where N is the number of rows
Space Complexity : O(1)
Did this code successfully run on Leetcode :
Any problem you faced while coding this :

Problem_1:  Pascal's Triangle, Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        """
        Using dynamic programming to solve the problem. By using tabulation method.
        """
        if numRows == 0: return []
        
        res = []
        
        for rows in range(numRows):
            row = [0 for i in range(rows + 1)]
            row[0], row[-1] = 1, 1
            
            for j in range (1, len(row) -1):
                row[j] = res[rows - 1][j - 1] + res[rows - 1][j]
                
            res.append(row)
            
        return res