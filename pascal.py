# Time Complexity: O(n^2)
# Space Complexity: O(1)

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        res = []
        for i in range (numRows):
            arr = [1 for x in range (i+1)]
            if i >= 2:
                for j in range (1, i):
                    arr[j] = res[i-1][j] + res[i-1][j-1]
            res.append(arr)
        return res
