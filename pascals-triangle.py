# Time Complexity: O(n^2)
# Space Complexity: O(1)
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        if numRows == 1:
            return [[1]]
        elif numRows == 2:
            return [[1], [1,1]]
        else:
            output = [[1 for i in range(x)] for x in range(1, numRows+1)]
            for i in range(2,len(output)):
                for j in range(1,i):
                    output[i][j] = output[i-1][j-1] + output[i-1][j]
            return(output)