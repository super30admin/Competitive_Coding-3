# Pascal's Triangle

# Time Complexity : O(numRows*numRows), the number of rows
# Space Complexity : O(numRows*numRows), the number of rows
# Did this code successfully run on Leetcode : Yes, with Runtime: 32 ms and Memory Usage: 14.4 MB
# Any problem you faced while coding this : Initally yes, After understanding no.
# Your code here along with comments explaining your approach
# Approach
"""
Using two loops, inner loop for genrating the result in 2D array having i and j as
row and column and outer loop for creating a new row. With Edge Cases being established
initially with number of rows being 0 and 1.

"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]: 
        if numRows == 0: 
            return []
        if numRows == 1:
            return [[1]]
        result = [[1]*i for i in range(1, numRows+1)]
        for i in range(2, numRows):
            for j in range(1, i):
                result[i][j] = result[i-1][j-1]+result[i-1][j]
        return result