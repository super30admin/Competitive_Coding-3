# Time: O(n * n) 
# Space: O(n * n)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        mat = []
        for numRow in range(1,numRows+1):
            if numRow == 1:
                mat.append([1])
            else:
                # set first and last to 1
                row = [1] * numRow
                mat.append(row)
                for j in range(1, numRow-1):
                    mat[numRow-1][j] = mat[numRow-2][j-1] + mat[numRow-2][j]
        return mat
