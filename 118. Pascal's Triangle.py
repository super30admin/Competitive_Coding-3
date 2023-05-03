#Time Complexity:O(n^2)
#Space Complexity:O(1)
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        dp=[]
        for i in range(1,numRows+1):
            dp.append([0]*i)
        for i in range(0,numRows):
            for j in range(0,i+1):
                if(j==0 or j==i):
                    dp[i][j]=1
                else:
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j]
        return dp