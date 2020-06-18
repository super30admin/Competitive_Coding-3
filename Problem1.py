# Time Complexity : O(n2) 
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class Solution:
    def generate(self, numRows):
        result = []
        if numRows == 0: 
            return result 
        result.append([1]) #if we are asked for only one row.
        if numRows == 1:
            return result
        result.append([1,1]) # we have to start filling numbers from the third row.
        for i in range(2,numRows):
            temp = [1]
            j = 1
            while j < len(result[i-1]):
                temp.append(result[i-1][j-1]+result[i-1][j])
                j += 1 
            temp.append(1)
            result.append(temp)
        return result