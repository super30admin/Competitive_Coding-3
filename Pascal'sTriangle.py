"""
Time Complexity : O(n^2) where n is no. of rows
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return [0]
        elif numRows == 1:
            return [[1]]
        result = [[1]]
        # Imagine the triangle is in the form of matrix
        # So the resultant matrix element would be the sum of the element
        # above it and the element next to the above element
        for j in range(1, numRows):
            row = [1]
            for i in range(1, j):
                row.append(result[j - 1][i] + result[j - 1][i -1])
            row.append(1)
            result.append(row)
        return result