"""
problem: Pascal's Triangle
Approach: corner elements are always 1. for each row loop from 1 -> (n - 1) and get the vales from previous row to calculate the current row.
t.c. => O(numRows^2)
s.c. => O(1)
"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        for i in range(numRows):
            tmp = [1 for i in range(i + 1)]
        
            for i in range(1, len(tmp) - 1):
                tmp[i] = res[-1][i - 1] + res[-1][i]
            res.append(tmp)
        return res

