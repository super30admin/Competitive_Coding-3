# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = []
        for i in range(numRows):
            ans.append([None for _ in range(i+1)])
            ans[i][0] = 1
            ans[i][-1] = 1
        if numRows <= 2:
            return ans
        for i in range(2,numRows):
            for j in range(1,i):
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1] # The value at ans[i][j] is the sum of the element directly above it in the previous row and the element before the one that is directly above it
        return ans