# Time Comlexity: O(n^2) n:numRows
# Space Complexity: O(n^2)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        matrix = [[0]*i for i in range(1,numRows+1)]
        print(matrix)
        matrix[0][0] = 1
        for i in range(numRows):
            for j in range(i+1):
                if j == 0 or i == j:
                    matrix[i][j] = 1
                elif j > 0 and i != j:
                    matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j]
        return matrix
