# time complexity : 0(n^2)
#space complexity : 0(1)
class Solution(object):
    def generate(self, numRows):
        
        result = []
        
        for i in range(numRows):
            rows = []
            for j in range(i+1):
                if j == 0 or j == i :
                    rows.append(1)
                else:
                    left = result[i-1][j-1]
                    right = result[i-1][j]
                    rows.append(left + right)
            result.append(rows)
        
        return result
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        