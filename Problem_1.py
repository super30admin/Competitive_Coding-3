#
# @lc app=leetcode id=118 lang=python3
#
# [118] Pascal's Triangle
#

# @lc code=start
'''
Time Complexity - O(m*n). n - number of rows and m - number of elements in a row
Space Complexity - O(m*n). We are using a nested list to store the triangle

This code works on Leetcode.
'''
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        for i in range(numRows):
            row = []
            for j in range(i+1):
                if j==0 or j==i: #first and last element of row is 1
                    row.append(1)
                else:
                    val = result[i-1][j-1] + result[i-1][j] #value at current index is a sum of elements at j-1 and j in the row above
                    row.append(val)
            result.append(row)
        return result
        
# @lc code=end

