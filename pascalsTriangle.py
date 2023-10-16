class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        # Time Complexity: O(N**2)
        # Space Complexity: O(1)
        result = [[1], [1, 1]]
        if numRows == 1: return [[1]]
        if numRows == 2: return result
        for i in range(2, numRows):
            temp = [1]
            for j in range(1, i):
                temp.append(result[i - 1][j] + result[i - 1][j - 1])
            temp.append(1)
            result.append(temp)
        return result
