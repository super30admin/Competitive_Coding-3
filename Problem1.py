#    Time Complexity : O(n^2)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        ans = []
        ans.append([1])
        
        for i in range(1,numRows):
            ans.append([1]*(i+1))
            for j in range(1,i):
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j]
        return ans
        
        