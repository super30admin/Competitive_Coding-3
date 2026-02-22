# Time Complexity : O(numRows ^ 2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : FIll the first and last index of each row with 1.
# Then use last row indices to fill the middle indices of current row.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = [] 

        for i in range(numRows): 
            temp = [None] * (i+1)
            temp[0], temp[-1] = 1, 1
            for j in range(1, len(temp) - 1):
                temp[j] = ans[i-1][j-1] + ans[i-1][j]

            ans.append(temp)
        return ans
        