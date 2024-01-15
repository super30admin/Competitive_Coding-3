""" Explanation: This is a DP problem, since we look at the two numbers above and take the sum. Since it's a repetitive subprocess, it's 
    a DP problem. The base case checks if the numRows == 0 and returns an empty list of list. 
    Then we initialize the triangle at the first row to begin the sub process, and simply iterate from the second row up to numRows.
    Then we store that row in a variable and add the previous two rows in every iteration.
    Time Complexcity: O(n^2)
    Space Complexcity: O(1)
"""



class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        # base case
        if numRows == 0:
            return [[]]

        # initialize the triangle with first rows
        triangles = [[1]]

        # iterate from second row up to numRows
        for i in range(1,numRows):
            # store the row
            row = [1] + [triangles[i-1][j-1] + triangles[i-1][j] for j in range(1,i)] + [1]

            triangles.append(row)

        return triangles