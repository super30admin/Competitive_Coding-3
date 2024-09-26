# Time Complexity is O(n2), where n is the number of rows
# Space complexity is O(1)
# Iteratively calculate the rows of Pascals triangle using formula : row[i] = prevRow[i-1] + prevRow[i]
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        
        if(numRows == 1):
            return [[1]]
        output = [[1],[1,1]]
        for i in range(2,numRows):
            currOutput = [1]*(i+1)
            for j in range(1,i):
                currOutput[j] = output[i-1][j-1]+output[i-1][j]
            output.append(currOutput)
        return output