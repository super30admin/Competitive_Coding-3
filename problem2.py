class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        mat = [[1]*i for i in range(1,numRows+1)]

        for j in range(2, numRows):
            for k in range(1, j):
                mat[j][k] = mat[j-1][k-1] + mat[j-1][k]
                
        return mat

# Generally O(n) solution where n is the total number of elements in the final returned matrix
# Space complexity is O(1)
# approach used "Element is the total sum of element from previous row previous column and previous row current column"