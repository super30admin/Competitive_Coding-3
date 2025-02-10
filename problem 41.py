# Time Complexity : O(n^2) n = numRows
# Space Complexity : O(n^2)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
# for pascals triangle we take a list of lists and assign values as 1 for length of i 
# ranging from 1 to numRows and then take another loop j from 1 to i and add the top left and top element of it.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = []
        for i in range(numRows):
            ans.append([1] * (i+1))
            for j in range (1,i):
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j]
        
        return ans
        
        