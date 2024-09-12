# Leetcode 118. Pascal's Triangle

# Time Complexity :  O(n^2) where n is the number of the rows

# Space Complexity : O(n^2) where n is the number of the rows

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Intialize a triangle with required number of rows, each row will have same number of elements
# as the row. In each row the first and last element is 1. The middle element is sum of the element at the
# same index and previous index in the previous row

# Your code here along with comments explaining your approach

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        tri = []
        for row_num in range(numRows):
            row = [None for _ in range(row_num+1)]
            for j in range(len(row)):
                if j == 0 or j == row_num:
                    row[j] = 1
                else:
                    row[j] = tri[row_num-1][j-1] + tri[row_num-1][j]
            tri.append(row)

        return tri
