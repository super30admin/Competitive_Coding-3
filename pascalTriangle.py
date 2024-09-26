# Time Complexity : O(N^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        
        if numRows <= 0:
            return res
        
        for i in range(numRows):
            curr = [] 
            for j in range(i+1):
                # where we want to populate curr
                # where we reach the ends of the list
                if j == 0 or j == i:
                    curr.append(1)
                # we're not at the ends and need to pull two values from prev row
                else:
                    leftValue = res[i-1][j-1]
                    rightValue = res[i-1][j]
                    total = leftValue + rightValue 
                    curr.append(total)
            res.append(curr)
        
        return res