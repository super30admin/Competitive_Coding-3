# // Time Complexity :o(numRows^2)
# // Space Complexity : o(1) if you dont consider the i/p o/p space else o(numRows^2)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1] * (i + 1) for i in range(numRows)]

        for i in range(2, numRows):
            for j in range(1, i):
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j]
        return result