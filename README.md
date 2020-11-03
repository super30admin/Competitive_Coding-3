Solution:

Time : O(N^2)
Space : O(N^2)

class Solution(object):
    def generate(self, numRows):
        output = []
        for row in range(1, numRows+1):
            new_row = [1]*row
            for j in range(1, row-1):
                new_row[j] = output[-1][j-1] + output[-1][j]
            output.append(new_row)
        return output