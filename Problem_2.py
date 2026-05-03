# https://leetcode.com/problems/pascals-triangle/

class Solution:
    def generate(self, numRows):
        result = [[1]]
        for row in range(1, numRows):
            temp = []
            for i in range(row + 1):
                if i == 0:
                    temp.append(result[row - 1][i])
                elif i == row:
                    temp.append(result[row - 1][i - 1])
                else:
                    temp.append(result[row - 1][i] + result[row - 1][i - 1])
            result.append(temp)
        return result
