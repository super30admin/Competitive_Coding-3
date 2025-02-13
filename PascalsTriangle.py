# Tc : O(n^2)
# SC : O(n^2)
from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result =  [[1]]
        if numRows == 1:
            return [[1]]
        for i in range(1, numRows):
            A = [0] * (i +1)
            A[0] = 1
            A[-1] = 1 
            for j in range(1, i):
                A[j] = result[i - 1][j - 1] + result[i - 1][j]
            result.append(A)
        return result
solution = Solution()
n = 5
final = solution.generate(n)
print(final)
            
                