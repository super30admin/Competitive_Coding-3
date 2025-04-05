# Build Pascal's Triangle row by row using previous row values
# TC: O(numRows^2), SC: O(numRows^2) for storing the triangle
from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = [[1]]

        for i in range(1, numRows):
            prev_row = triangle[-1]
            new_row = [1]

            for j in range(1, i):
                new_row.append(prev_row[j - 1] + prev_row[j])
            new_row.append(1)  # End each new row with 1
            triangle.append(new_row)  # Add the new row to the triangle

        return triangle


sol = Solution()
print(sol.generate(5))
