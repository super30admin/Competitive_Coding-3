class Solution:
    def generate(self, numRows: int):
        dp = [[] for i in range(numRows)]
        
        for i in range(numRows):
            for j in range(i+1):
                dp[i].append(0) 
        
        dp[0] = [1]
        
        for i in range(1,numRows):
            for j in range(i+1):
                if j == 0:
                    dp[i][j] = dp[i-1][j]
                elif j == i:
                    dp[i][j] = dp[i-1][j-1]
                else:
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
            

        return dp

#TC: 
#SC: