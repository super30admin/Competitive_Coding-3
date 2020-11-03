# Time Complexity: O(n^2)
# Space Complexity: O(1) - No auxillary space used
# Approach:
# Initialize a triangular grid to compute the result
# Use the recurrence - f(i,j) = f(i-1, j) + f(i-1, j-1) 
# Compute and populate subsequent rows with the result

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        table = [1] * (numRows)

        for row in range(numRows):
            table[row] = [1] * (row+1)

        for row in range(2,numRows):
            for k in range(1,row):
                table[row][k] = table[row-1][k] + table[row-1][k-1]

        return table