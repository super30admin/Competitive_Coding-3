#Time Complexity :O(N) where N isnumber of inputs
#Space Complexity: O(N) where N is number of inputs

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        result = [[1]]
        if numRows ==0:
            return []
        
        for i in range(1,numRows):
            k = []
            for j in range(i+1):
                if j == 0:
                    k.append(1)
                elif j == i:
                    k.append(1)
                else:
                    s = result[i-1][j-1]+result[i-1][j]
                    k.append(s)
            result.append(k)
        return result
            