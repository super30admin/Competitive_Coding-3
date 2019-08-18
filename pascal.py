"""
time: O(n^2)
Space:O(n^2)
Leet: Accept
Problems: None
"""

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        row = [1]
        res = []
        if numRows == 0:
            return res

        res.append(row)

        for i in range(2,numRows+1):
            newRow = [0] * i
            newRow[0],newRow[-1] = 1,1
            for i in range(1, len(newRow)-1):
                newRow[i] = row[i-1] + row[i]
            row = newRow
            res.append(row)

        return res
