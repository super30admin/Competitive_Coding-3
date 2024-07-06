"""
Problem:
Pasacl's Triangle
https://leetcode.com/problems/pascals-triangle/

Mock Interview Solutions
https://youtu.be/LZnp0rpEc1U

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]

Time Complexity : O(n^2) where n is numRows
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick is to understand that the middle formation requires previous values.
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows < 0:
            return []
        
        triangle = []

        for i in range(numRows):
            row = [1] * (i+1)

            for j in range(1,i):
                row[j] = triangle[i-1][j-1] + triangle[i-1][j]
            triangle.append(row)

        return triangle