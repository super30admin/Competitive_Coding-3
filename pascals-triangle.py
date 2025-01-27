# tc O(n^2), sc O(n^2).
triangle = [[1 for _ in range(i+1)] for i in range(numRows)]

for row in range(2, numRows):
    for column in range(1, row):
        triangle[row][column] = triangle[row-1][column-1] + triangle[row-1][column]

return triangle