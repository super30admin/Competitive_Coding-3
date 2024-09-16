# Time Complexity: O(n^2) where n is numRows
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we create the pascal's triangle by simply adding the two particular values 
of the previous level to create values in the new level.
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == None or numRows == 0:
            return []

        pascal_tri = []

        for i in range(1, numRows + 1):
            new_level = [1]
            for j in range(1, i):
                if j == i - 1:
                    new_level.append(1)
                else:
                    new_level.append(sum(pascal_tri[i-2][j-1:j+1]))

            pascal_tri.append(new_level)

        return pascal_tri