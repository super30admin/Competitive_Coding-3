# Time complexity: O(k^2)
# Space complexity: O(k)
# Works on leetcode: yes
# Approach: The basic idea is to iteratively update the array from the end to the beginning where the end starts from
# iterating through the rowindices.
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        dp = [1]*(rowIndex+1)
        for i in range(2,rowIndex+1):
            for j in range(i-1,0,-1):
                dp[j] += dp[j-1]
        return dp
        