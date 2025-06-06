# Time Complexity: O(n^2)
# Space Complexity: O(n^2)

class Solution:
    def pascal_triangle(self, num_rows):
        triangle = []
        for i in range(num_rows):
            row = [1] * (i + 1)
            for j in range(1, i):
                row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
            triangle.append(row)

        return triangle
