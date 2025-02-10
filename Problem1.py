# Problem 1 : Pascal's Triangle
# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
'''
The issue I encountered was with the edge case where the number of rows is 1. In this scenario, I had to include an if condition 
to check if numRows equals 1, and if so, simply return a list containing just that single row.
'''

# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        # Created a result List[List[int]] for storing the pascal's triangle value
        result = [[] for i in range(numRows)]
        # if the number of rows is one then return list of 1
        if (numRows  == 1):
            return [[1]]
        
        # 1st Row
        result[0].append(1)
        # 2nd Row
        result[1].append(1)
        result[1].append(1)
        # loop for 2nd row to last row
        # i is the index of the row and j is index of the element in the row
        for i in range(2, numRows):
            # appending the first element of the row as 1 
            result[i].append(1)

            # Calculate the middle element of the row and check if the index j is less than the length of the row
            j = 0
            while (j < len(result[i-1]) -1):
                # Added the elements [j] and [j-1] element of the previous row (i-1)
                temp = result[i-1][j] + result[i-1][j+1]
                j += 1
                result[i].append(temp)

            # appending the last element of the row as 1 
            result[i].append(1)

        return result