#  Time Complexity
0(N2)
# Space complexity
0(N2)

class Solution(object):
    def generate(self, numRows):
        
# 1
# 1 1
# 1 2 1
# 1 3 3 1
# 1 4 6 4 1
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        result = []
        for i in range(numRows):
            
            row = [1 for x in range(i+1)]
            row[0] = row[-1] = 1
            
            for j in range(1,len(row)-1):
                row[j] = result[i-1][j-1]+result[i-1][j]
                
            result.append(row)
                
        return result
