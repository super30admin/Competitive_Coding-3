# The code defines a generate method to create Pascal's Triangle with the specified number of rows.
# Pascal's Triangle is a triangular array where each element is the sum of the two elements directly above it in the previous row.

# Initialization:
#   - 'triangle' is an empty list that will store the rows of Pascal's Triangle.

# Main Loop:
#   - Iterate over the range from 0 to numRows - 1 (inclusive), where each iteration corresponds to constructing one row of the triangle:
#       - Create a new row filled with ones, with a length equal to the current row index + 1.
#       - For rows with more than two elements (i.e., i > 0):
#           - Calculate the inner elements of the row (from index 1 to i - 1) using values from the previous row.
#           - Each inner element at index j is computed as the sum of triangle[i - 1][j - 1] (left parent) and triangle[i - 1][j] (right parent).
#       - Append the completed row to 'triangle'.

# Final Result:
#   - After all rows are constructed, 'triangle' contains the complete Pascal's Triangle with numRows rows, which is returned.

# TC: O(n^2) - Constructing each row involves iterating over the row's length, resulting in quadratic time complexity for n rows.
# SC: O(n^2) - The space complexity is proportional to the total number of elements in the triangle, which is the sum of the first n integers.


from typing import List

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = []

        for i in range(numRows):
            row = [1] * (i + 1)

            for j in range(1, i):
                row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]

            triangle.append(row)

        return triangle