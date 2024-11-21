"""# Explain your approach in three sentences only at the top of your code
# This optimal solution reduces redundancy by using the existing rows as a reference to calculate the next row efficiently.
# We construct each row iteratively by adding the sum of adjacent values from the previous row.
# This avoids recalculating values multiple times and directly generates the triangle.

# Time Complexity: O(numRows^2) - Each row is computed once with values derived directly from the previous row.
# Space Complexity: O(numRows^2) - Space required to store the entire triangle.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        # Initialize the triangle with the first row
        triangle = [[1]]
        
        # Generate each row starting from the second row
        for i in range(1, numRows):
            # Start the row with 1
            row = [1]
            
            # Calculate the intermediate values
            for j in range(1, i):
                row.append(triangle[i - 1][j - 1] + triangle[i - 1][j])
            
            # End the row with 1
            row.append(1)
            
            # Add the row to the triangle
            triangle.append(row)
        
        return triangle
"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        # Initialize the first row
        row = [1]
        result = []  # Store results if needed
        
        for _ in range(numRows):
            # Append a copy of the current row to the result
            result.append(row[:])
            
            # Generate the next row in-place
            # Add adjacent elements from the current row
            row = [1] + [row[i] + row[i + 1] for i in range(len(row) - 1)] + [1]
        
        return result
