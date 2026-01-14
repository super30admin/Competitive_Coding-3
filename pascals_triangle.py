"""
time - o(n^2)
space - o(n^2)
We take base triangles for size 1 and 2 and we then build on the triangles from there with first and last number of the list as 1
and the other numbers are previous list [i-1] + previous list [i+1]
"""

from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 1:
            return [[1]]
        elif numRows == 2:
            return [[1], [1, 1]]
        base_rows = [[1], [1, 1]]

        for i in range(2, numRows):
            new_row = [1] * (i + 1)
            for j in range(1, i):
                new_row[j] = base_rows[i - 1][j - 1] + base_rows[i - 1][j]
            base_rows.append(new_row)

        return base_rows
