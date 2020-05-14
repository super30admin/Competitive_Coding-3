"""
// Time Complexity :O(n2)
// Space Complexity :O(n) memory is used to store the triplet.
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :Failed when coins=NA

//Explanation:
Initialize dp and row matrix [1]
Append 1 at the first and last index position of the list
Perform the operation at list level.
Append list in the final dp matrix. 
"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
      dp = []

      for i in range(1, numRows):
        row = [1]
        for j in range(1,i):
          row.append(dp[i-1][j-1]+dp[i-1][j])
        row.append(1)
        dp.append(row)
      return dp
