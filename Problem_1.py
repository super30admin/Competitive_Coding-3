# https://leetcode.com/problems/pascals-triangle/description/

# Time complexity: O(n ^ 2) 
# Space complexity: O(1)
# Explanation: We can create rows one by one, and compute the in between values using the previous row. The first value and last value is always 1.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = []

        for r in range(numRows):
            row = [1] * (r + 1)
            for j in range(1, len(row) - 1):
                row[j] = triangle[r - 1][j - 1] + triangle[r - 1][j]
            triangle.append(row)
        
        return triangle
