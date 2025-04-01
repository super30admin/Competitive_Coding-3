# Time complexity: O(n^2) where n = numRows
# Space complexity: O(n) where n is the capacity of the heap
# Did this code run successfully on Leetcode: Yes

from typing import List
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        res.append([1])
        if numRows >= 2:
            res.append([1, 1])

        for i in range(2, numRows):
            j = 0
            row = []
            while j <= i:
                if j == 0:
                    row.append(1)
                elif j == i:
                    row.append(1)
                else:
                    row.append(res[i-1][j-1] + res[i-1][j])
                j += 1
            res.append(row)

        return res