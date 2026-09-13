# Time Complexity : O(numRows^2)
# Space Complexity : O(numRows^2) to store output rows
# Did this code successfully run on Leetcode : Yes
class Solution:
    def generate(self, numRows):
        result = []
        result.append([1])
        
        for i in range(1, numRows):
            prevRow = result[i - 1]
            curRow = []
            curRow.append(1)
            for j in range(1, len(prevRow)):
                curRow.append(prevRow[j - 1] + prevRow[j])
            curRow.append(1)
            result.append(curRow)
        
        return result
