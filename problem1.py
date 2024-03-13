# https://leetcode.com/problems/pascals-triangle/

# Time Complexity : O(M * N) is number of values in each row.
# Space Complexity : O(1) no extra space used apart from result.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach.
# Approach - We create one row at a time and use previous row to create next row for all the rows.

from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        elif numRows == 1:
            return [[1]]
        triangle = [[1]]
        for i in range(1, numRows):
            row = [1]
            for j in range(1, i):
                row.append(triangle[i - 1][j - 1] + triangle[i - 1][j])
            row.append(1)
            triangle.append(row)
        return triangle
