# // Time Complexity : O(n*n) where n is the number of rows
# // Space Complexity : O(n*n) where n is the number of rows
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if not numRows: return []
        R = [[1]]
        if numRows < 2: return R
            
        R = [[1],[1,1]]
        
        for i in range(2,numRows):
            a = [1]
            for j in range(1,i):
                sumx = R[i-1][j-1] + R[i-1][j]
                a += [sumx]
            a += [1]
            R.append(a)
        return R