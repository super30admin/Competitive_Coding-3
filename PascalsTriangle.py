# Time Complexity : O(N^2)
# Space Complexity : O(N^2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :

# Your code here along with comments explaining your approach
# Using Dynamic Programming for this approach. Iterating over the numsRow and initializing first and last element of newRow to 1
# Then iterating over the row upto i to calculate the prevRow index + prevRow index-1


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        if numRows == 0:
            return res
        for i in range(numRows):
            newRow = [None for _ in range(i + 1)]
            newRow[0] = 1
            newRow[-1] = 1
            for j in range(1, i):
                newRow[j] = res[i - 1][j - 1] + res[i - 1][j]
            res.append(newRow)

        return res
