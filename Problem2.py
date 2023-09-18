# tc: O(n)
# sc: O(1)

class Solution:
    def generate(self, numRows):
        triangle = []
        for i in range(numRows):
            row = [0]*(i+1)
            row[0], row[-1] = 1, 1
            for j in range(1, i):
                row[j] = triangle[i-1][j-1] + triangle[i-1][j]
            triangle.append(row)
        return triangle
        