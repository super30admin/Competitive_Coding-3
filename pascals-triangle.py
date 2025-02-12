# Approach:
# We initialize an empty list triangle and iterate numRows times, creating each row with 1s. 
# For each row (except the first two), we update the middle elements using the sum of two elements from the previous row.
# Time & Space Complexity:
# Time Complexity: O(n^2) (Each row computation takes linear time, leading to a quadratic sum).
# Space Complexity: O(n^2) (Storing all rows of Pascal’s Triangle)
def generate(self, numRows: int) -> List[List[int]]:
        triangle = []
        for i in range(numRows):
            row = [1] * (i + 1)
            for j in range(1, i):
                row[j] = triangle[i - 1][j] + triangle[i - 1][j - 1]
            triangle.append(row)
        return triangle