# Pascal's Triangle

# Approach
# Create a 2D matrix and initiate all the values to 1
# Start traversing from row 2 to m and column 3 to second last index. For each index, calculate the sum for element in above row same column and revious row and previous 1 column
# Set the new value. Return the 2d Matrix

# TC: O(m*n)
# SC: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        m = numRows
 

        mat = []
        for i in range(m):
            row = []
            for j in range(i+1):
                row.append(1)
            mat.append(row)
        
        for r in range(2,m):
            for c in range(1,len(mat[r])-1):
                mat[r][c] = mat[r-1][c] + mat[r-1][c-1]
        return mat