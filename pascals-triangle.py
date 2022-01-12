'''

TC: O(n*2)
SC: O(1)

Intuition:

Repeating subproblems, make of use of previous row

'''
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        dp = [[1 for j in range(i)] for i in range(1, numRows + 1)]
        
        for i in range(2, numRows):
            for j in range(1, len(dp[i]) - 1):
                dp[i][j] = dp[i-1][j - 1] + dp[i-1][j]
            
        return dp
            