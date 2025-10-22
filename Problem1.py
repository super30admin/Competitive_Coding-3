"""
TC: O(N squared) The time complexity is dominated by the nested loops, which compute approximately N squared divided by 2 elements in the triangle.
SC: O(N squared) The space complexity is determined by the storage of the entire Pascal's triangle, which has N squared divided by 2 elements.

Approach:

This problem is solved using a simple iterative approach based on the definition of Pascal's triangle. The goal is to generate the first N rows of the triangle.

1.  Base Cases: The first two rows are hardcoded: [1] and [1, 1].
2.  Iterative Construction: We iterate from the third row up to the Nth row. To construct the current row (row $i$), we use the elements of the previously computed row (row $i-1$).
3.  Core Formula: Every row starts and ends with 1. The inner elements are calculated using the core formula: an element at index $j$ in the current row is the sum of the two elements directly above it in the previous row, specifically: $\text{res}[i-1][j-1] + \text{res}[i-1][j]$.

The algorithm iteratively builds the triangle row by row, storing each row in the result list.

The problem ran successfully on LeetCode.
"""
from typing import List
class Solution:
    def generate(self, n: int) -> List[List[int]]:
        if n == 1:
            return [[1]]
        if n == 2:
            return [[1], [1,1]]
        
        res = [[1], [1,1]]
        for i in range(2, n):
            row = [1]
            for j in range(1, i):
                row.append(res[i-1][j-1] + res[i-1][j])
            row.append(1)

            res.append(row)
        
        return res