class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        :time complexity:O(n^2) 
        :space complexity:O(1)
        """
        # create list of list to store res
        res = [[1]*(i+1) for i in range(numRows)]
        for i in range(2, len(res)):
            for j in range(1, i):
                res[i][j] = res[i-1][j-1] + res[i-1][j]
        return res