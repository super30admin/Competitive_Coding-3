# Time Complexity : O(N) where N is height of the pascal's triangle
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        
        for i in range(1, numRows):
            tempRow = [1]
            for j in range(1, i):
                tempRow.append(result[i-1][j-1] + result[i-1][j])
            
            tempRow.append(1)
            result.append(tempRow)
        
        return result