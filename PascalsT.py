# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        res = []
        for i in range(numRows):
            rowList = []
            for j in range(i + 1):
                if (j == 0 or j == i):
                    rowList.append(1)
                else:
                    left = res[i - 1][j - 1]
                    right = res[i - 1][j]
                    rowList.append(left + right)
            res.append(rowList)
        return res