#Time Complexity: O(n)
#Space Complexity: O(1)

class Solution:

    def generate(self, numRows):
        dp = []

        for i in range(0, numRows+1):
            dp.append([0] * i)

        for i in range(numRows):
            for j in range(0, i+1):
                if (j == 0 or j == i):
                    dp[i][j] = 1
                else:
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j]

        return dp



numRows = [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
result = Solution()
output = result.generate(numRows)
print(output)