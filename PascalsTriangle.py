# Space complexity - o(1)
# Time Complexity - o(n^2)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
    

        matrix = []

        for i in range(numRows):
            result = []
            for j in range(i+1):
                if j == 0 or j == i:
                    result.append(1)
                else:
                    if i>0:
                        result.append((matrix[i-1][j]+matrix[i-1][j-1]))

            matrix.append(result)

        return matrix
