# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        for i in range(numRows):
            temp = []
            for j in range(i+1):
                if j == 0 or i == j:
                    temp.append(1)
                else:
                    temp.append(res[i-1][j-1]+res[i-1][j])
            
            res.append(temp)
        
        
        return res

sc = Solution()
numRows = 5
print(sc.generate(numRows))