# Time Complexity : Add - O(mn)
# Space Complexity :O(mn)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. First two rows are [1], [1,1]
2. For remaining rows the intermidate values are the sum of corresponding values in the row above it
'''

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        if numRows <= 0:
            return []
        
        pascal_matrix = [0]*numRows
        
        for i in range(numRows):
            if i == 0:
                pascal_matrix[i] = [1]             
            elif i == 1:
                pascal_matrix[i] = [1,1]
                
            elif i >= 2:
                pascal_matrix[i] = [0]*(i+1)
                for j in range(1,i):
                    pascal_matrix[i][j] = pascal_matrix[i-1][j-1] + pascal_matrix[i-1][j]
                
                pascal_matrix[i][0] = 1
                pascal_matrix[i][i] = 1
                
            # print (pascal_matrix)
                
        return pascal_matrix
                    