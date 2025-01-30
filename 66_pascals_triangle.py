# Time complexity - O(n)
# Space complexity - O(1)

# Approach - Generate a triangle with 1's for given numRows, run a for loop from row 2, iterate
# over entire row assigning the addition values.

from typing import List
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        tri = [[1]*(i+1) for i in range(numRows)]
        for i in range(2, numRows):
            for j in range(1, i):
                tri[i][j] = tri[i-1][j-1] + tri[i-1][j]
        
        return tri