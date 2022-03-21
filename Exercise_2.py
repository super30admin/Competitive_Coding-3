    # 118. Pascal's Triangle

    # Time Complexity : O(n*n)
    # Space Complexity : O(n*n)

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        ret_matrix = [[1]*(x+1) for x in range(numRows)]

        for i in range(numRows):
            for j in range(len(ret_matrix[i])-1):
                if i > 0 and j > 0:
                    ret_matrix[i][j] = ret_matrix[i-1][j-1] + ret_matrix[i-1][j]
        return ret_matrix
    