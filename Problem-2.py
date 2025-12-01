# Time Complexity : O(n^2)
# Space Complexity :O(n^2)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
# Start with the first two base rows of Pascal’s Triangle: [1] and [1, 1].
# For each new row, compute inner values by adding two adjacent numbers from the previous row.
# Append 1 at the start and end of each row to complete it, and repeat until all rows are built.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 1:
            return [[1]]
        if numRows == 2:
            return [[1],[1,1]]
        output = [[1],[1,1]]
        def res_row(prev,i):
            result = []
            result.append(1)
            for k in range(1,i):
                result.append(prev[k-1]+prev[k])
            result.append(1)
            return result
        for i in range(2,numRows):
            prev= output[-1]
            numrow_result = res_row(prev,i)
            output.append(numrow_result)
        return output

        