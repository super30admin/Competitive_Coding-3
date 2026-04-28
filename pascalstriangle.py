# // Time Complexity : O(n^2)
# // Space Complexity : O(1) excluding output 
# // Did this code successfully run on Leetcode : Yes

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        if numRows==1:
            return [[1]]
        res=[[1],[1,1]]
        for i in range(3,numRows+1):
            newrow = [1]            
            prev=res[-1]
            for j in range(len(prev)-1):
                newrow.append(prev[j]+prev[j+1])     
            newrow.append(1)
            res.append(newrow)

        return res
        