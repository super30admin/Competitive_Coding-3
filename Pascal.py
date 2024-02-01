# Time Complexity: O(N)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
      if numRows == 1:
        return [[1]]
      if numRows == 2:
        return [[1], [1,1]]
      res = [[1], [1,1]] + [[] for _ in range(2, numRows)]

      for i in range(2, numRows):
        res[i] = [0] * (i + 1)
        for j in range(i + 1):
          if j == 0 or j >= len(res[i-1]):
            res[i][j] = 1
          else:
            res[i][j] = res[i - 1][j-1] + res[i-1][j]
      return res


        
