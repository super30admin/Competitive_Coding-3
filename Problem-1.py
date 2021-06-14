"""
Approach:
1) Look at the previous row and compute sum of element pairs, the elements of the new row would always have 1 at the
beginning and end
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        out = [[1]]

        for i in range(2, numRow s +1):
            curr = [1] # [1,1,1,1]
            for j in range(1, i- 1):
                sum_ = out[-1][j] + out[-1][j - 1]
                curr.append(sum_)
            curr.append(1)
            out.append(curr)
        return out

"""
TC: O(n^2) where n -> number of rows
SC: O(1)
"""