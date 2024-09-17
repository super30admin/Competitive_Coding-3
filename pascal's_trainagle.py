#Time Complexity: O(N).
#Auxiliary Space: O(1)
#Did this code successfully run on Leetcode :Yes



class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        result = [[] for i in range(0,numRows)]
        result[0] = [1]
        prev_row = 0
        
        for  i in range(1,numRows):
            ##i+1 -- len(i)
            result[i].append(1)
            for j in range(0,prev_row+1):
                if j==prev_row:
                    result[i].append(1)
                    break
                result[i].append(result[prev_row][j]+result[prev_row][j+1] )
            prev_row = i
                
            
        return result