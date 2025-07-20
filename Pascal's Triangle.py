#Time complexity: O(n^2)
#Space complexity: O(n^2)
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        res = []
        for i in range(0,numRows):
            row = []
            for j in range(0,i+1):
                if j == 0 or j == i:
                    row.append(1)
                else:
                    left = res[i - 1][j - 1]
                    right = res[i - 1][j]
                    row.append(left + right)
            res.append(row)
        return res

        