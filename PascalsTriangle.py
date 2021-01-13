# TC = O(n2)
# SC = O(n2)
# DP solution would be to store values computed at each row. As present row elements(2) determine elements of next row except the 1's at each end. 
class Solution:
    def generate(self, numRows):
        dp = []
        for i in range(numRows):
            # we build each row 
            # intiatialize with 1's as first and last elements are 1's and rest can be computed and rewriten
            row = [1] * (i+1)
            # compute middle elements
            for j in range(1, len(row)-1):
                row[j] = dp[i-1][j-1] + dp[i-1][j]
            dp.append(row)
        # pascal triangle formed
        return dp
    
    