# // Time Complexity :O(N^2)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

# https://leetcode.com/problems/pascals-triangle/description/
# // Your code here along with comments explaining your approach
  #every list starts and ends with one
        #for i in range(prev len -2):
        #prevnums[i]+#prevnums[i+1]
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        #every list starts and ends with one
        #for i in range(prev len -2):
        #prevnums[i]+#prevnums[i+1]
        ans=[[1],[1,1]]
        if numRows==1:return [[1]]
        for idx in range(2,numRows):
            temp_ans=[1]
            for j in range(idx-1):
                temp_ans.append(ans[idx-1][j]+ans[idx-1][j+1])
            temp_ans.append(1)
            ans.append(temp_ans)
        return ans



