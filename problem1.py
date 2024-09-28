##Time Complexity : O(mn)
##Space Complexity :O(1)
##Did this code successfully run on Leetcode : Yes
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        res  = [[1]]
        
        for i in range(numRows -1):
            temp = [0] + res[-1] + [0]
            row = []
            for j in range(len(res[-1]) + 1):
                row.append(temp[j] + temp[j + 1])
            res.append(row)
        return res
        