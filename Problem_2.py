"""
Time Complexity : O(n^2) I am not sure about the complexity.Please guide me with this
Space Complexity : O(1) as we are returning the result
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
Here, we need to generate a Pascals Triangle. Staring and ending value of each row needs to be 1. Ecxept for them,
every value is sum of values present in the previous row from result array. Their position are (j-1) and j
if j is the position of current value.
"""


class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        result = []
        for i in range(numRows):
            row = [1 for x in range(i+1)]
            for j in range(1, len(row)-1):
                row[j] = result[i-1][j-1]+result[i-1][j]
            result.append(row)
        return(result)
