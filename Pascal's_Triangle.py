# Time Complexity: O(n*n)
# Space Complexity: O(n)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = []

        for i in range(numRows):
            row = [None]*(i+1)
            row[0] = row[-1] = 1

            for j in range(1, len(row) - 1):
                row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
            
            triangle.append(row)

        return triangle
        