# 118. Pascal's Triangle

# Time Complexity: O(n^2)
# Space Complexity: O(n^2)

# Approach:
# Use a nested loop to generate the Pascal's Triangle.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        
        triangle = [[1]]
        
        for i in range(1, numRows):
            prev_row = triangle[-1]
            new_row = [1]
            
            for j in range(1, i):
                new_row.append(prev_row[j-1] + prev_row[j])
                
            new_row.append(1)
            triangle.append(new_row)
            
        return triangle
