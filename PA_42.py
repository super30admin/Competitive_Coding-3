#LC 119 - Pascals Triangle II
#Time Complexity - O(k^2)
#Space Complexity - O(k)
class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        def helper(path,idx,rowIndex):
            if idx == rowIndex:
                return path
            i = len(path)-1
            while i > 0:
                path[i] = path[i] + path[i-1]
                i = i - 1
            path.append(1)
            
            return helper(path,idx+1,rowIndex)
        return(helper([1],0,rowIndex))