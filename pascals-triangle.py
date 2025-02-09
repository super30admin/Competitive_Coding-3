# Time Complexity : O(n^2) - n is numRows
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
For first and last element of the row, take the first and last element of the previous row
For elements in between, take th sum of element above it + element above it to the left

"""

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """

        result = [[1]]

        for i in range(1,numRows):
            lst = []
            for j in range(0,i+1):
                if j == 0:
                    a = result[i-1][j]
                elif j == i:
                    a = result[i-1][j-1]
                else:
                    a = result[i-1][j] + result[i-1][j-1]
                lst.append(a)
            result.append(lst)
        return result
