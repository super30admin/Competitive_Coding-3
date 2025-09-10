from typing import List
# Time Complexity : O(n^2) where is n in numsRow
# Space Complexity : O(1) since result is auxiliary space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# The intuition is to loop until numRows and then get the topRow(basically previous appended result) and then sum them.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        if numRows == 1:
            return result
        for i in range(1, numRows):
            topRow = result[i-1]
            subResult = [1]
            for j in range(1,len(topRow)):
                subResult.append(topRow[j] + topRow[j-1])
            subResult.append(1)
            result.append(subResult)

        return result
