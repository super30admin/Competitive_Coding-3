class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        dp = []
        for i in range(1, numRows + 1):
            dp.append([0] * i)

        for i in range(0, numRows):
            for j in range(0, i + 1):
                if j == 0 or j == i:
                    dp[i][j] = 1
                else:
                    # The previous values both are added together
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
        return dp
