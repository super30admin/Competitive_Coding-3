"""
# Approach
Here we are using 2 loops. one to iterate to the row and another to fill the values in the row.
if no. of rows = 0, we return empty list.
if no.of rows = 1 and 2, then it will have 1 and 2 elements. both will have the values of 1.
if no.of rows = 3, then we will have 3 elements to fill the row.  first and last are 1 by default. we calculate the 2nd element based on its previous row.
we continue the same till the end and return the triangle

# Time complexity: O(n2)

# Space complexity:o(n2)

Did this code successfully run on Leetcode : Yes

Any problem you faced while coding this : No

"""

from typing import List
class Solution:
    def generatePascal(self, numRows: int) -> List[List[int]]:
        triangle = []
        for rowNum in range(numRows):
            row = [1]
            if triangle:
                prev_row = triangle[-1]               
                for j in range(1,rowNum):
                    row.append(prev_row[j-1] + prev_row[j])
                row.append(1)
            triangle.append(row)
        return triangle
    
sol = Solution()
k = 5
print(sol.generatePascal(k))