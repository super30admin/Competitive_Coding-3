"""

Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:

Input: numRows = 1
Output: [[1]]

Time Complexity: O(N^2) 
Space Complexity: O(N^2)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# Approach: 
# started with the first row as [[1]] and iteratively generate each subsequent row using the previous row.  
# By padding the previous row with zeros on both ends, we compute the next row by summing adjacent elements.  
# This continues until we generate the required number of rows, forming Pascal's Triangle.  


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        res = [[1]]

        for i in range(numRows-1):
            temp = [0] + res[-1] + [0]
            row = []

            for j in range(len(res[-1])+1):
                row.append(temp[j] + temp[j+1])
            
            res.append(row)

        return res
