# Time: O(n^2)
# Space: O(1)
# did the code run? yes
# issues faced with ending indices of j
# Approach:
# compute each element by adding its top 2 elements.
# those are i-1, j-1 and i-1, j

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        out = [[1 for j in range(i+1)] for i in range(numRows)]
        for i in range(numRows):
            for j in range(1, i):
                out[i][j] = out[i-1][j-1] + out[i-1][j]
        return out