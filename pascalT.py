# Time Complexity : O(numRows^2)
# Space Complexity : O(numRows^2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        matrix = []
        for i in range(numRows):
            row,j = [],0
            while j <= i:
                if j==0 or j==i:
                    row.append(1)
                else:
                    ele = matrix[i-1][j-1]+matrix[i-1][j]
                    row.append(ele)
                j+=1
            matrix.append(row)  
        return matrix          
        
