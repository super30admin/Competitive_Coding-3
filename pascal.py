# Time Complexity : O(n^2) m : no.of rows
# Space Complexity: O(n^2) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Add first and last '1' separately . Take the prev row and add respective indices to get the current row.


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows < 1:
            return []

        res = [[1]]

        for i in range(1, numRows):
            temp = [1]
            prev = res[-1]

            for j in range(len(prev)-1):
                temp.append(prev[j]+prev[j+1])

            temp.append(1)
            res.append(temp)

        return res