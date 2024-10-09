# T.C = O(numRows^2)  S.C = O(numRows^2)
# Have made 2d array with all the values 1 becuase we need 1 at start and end and take the above row and column for addition 
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """

        result= [[1] * (i + 1) for i in range(numRows)]
        for i in range(numRows):
            for j in range(1,i):   
                result[i][j] = result[i-1][j-1] + result[i-1][j]
        return result

        