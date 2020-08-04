# Time Complexity : O(n^2) where n is the numrows, in which each row is incremented from one to len(numrows)
# Space Complexity : O(n^2) where one n is for number of rows, another is number of elements in the rows
# Did this code successfully run on LeetCode :  yes
# Any problem you faced while coding this : no


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        triangle = []

        for i in range(numRows):

            # we will intialize each row as i + 1 length
            rows = [None for j in range(i + 1)]

            # we make the first and last element 1
            rows[0] = rows[-1] = 1

            # we will iterate throught elements betweeen first and last
            for k in range(1, len(rows) - 1):
                # we will add previos row, exactt position element value + previous row previous positoin element value
                rows[k] = triangle[i - 1][k - 1] + triangle[i - 1][k]

            # we append each row to the main triangle
            triangle.append(rows)

        return triangle
