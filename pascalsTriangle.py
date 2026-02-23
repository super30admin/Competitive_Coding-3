# Time Complexity : O(n^2)
# Space Complexity : O(n^2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Build Pascal’s Triangle row by row.
# Each row starts and ends with 1, and inner elements are sum of two elements above it.
# Use the previous row to compute the current row and append to result.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1]]
        for i in range(1, numRows):
            dup_list = [1] * (i + 1)
            for j in range(1, len(dup_list) - 1):
                dup_list[j] = res[i-1][j - 1] + res[i-1][j]
            res.append(dup_list)

        return res