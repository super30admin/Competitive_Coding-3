# Time Complexity : O(N^2) 
# Space Complexity :    O(1) 
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = []

        for i in range(numRows):
            currow = [0]*(i+1)
            currow[0]=1
            currow[-1]=1
            
            for j in range(1,len(currow)-1):
                currow[j] = ans[i-1][j-1]+ans[i-1][j]
            ans.append(currow)
        return ans