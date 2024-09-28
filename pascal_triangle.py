"""
Problem: Pascal's Triangle
Leetcode: https://leetcode.com/problems/pascals-triangle/
Time Complexity: O(n^2), need to traverse for total number of rows and elements of each row
Space Complexity: O(n^2), we need to store each number in triangle
"""


class Solution:
    def generate(self, numRows):
        # Base case
        if numRows == 0:
            return []

        # Corner case
        elif numRows == 1:
            return [[1]]

        # Make a default list of list for pascal triangle
        triangle = [[1]]

        # Make rows in triangle for the given numRows
        for i in range(1, numRows):
            # each row's first element is 1
            row = [1]
            # Add middle elements of the row
            for j in range(1, i):
                row.append(triangle[i - 1][j - 1] + triangle[i - 1][j])
            # each row's last element is 1
            row.append(1)
            # add this row to the triangle
            triangle.append(row)
            
        return triangle


obj = Solution()
print(obj.generate(5))