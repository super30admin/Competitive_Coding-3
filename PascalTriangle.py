class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        if numRows == 0:
            return [[]]

        if numRows == 1:
            return [[1]] 
        
        row = 0
        col = 0
        matrix = []

        for row in range(numRows):
            newRow = [1] * (row + 1)
            
            for col in range(1, row):
                newRow[col] = matrix[row - 1][col - 1] + matrix[row - 1][col]
            
            matrix.append(newRow)
        
        return matrix


                
            

