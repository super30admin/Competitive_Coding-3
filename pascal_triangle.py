# Time Complexity: O(n^2)
# Space Complexity: O(1) if out array is not considered
# Ran on Leetcode: Yes

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        out = []
        for i in range(0, numRows):
            row = []
            for j in range(i + 1):
                # If the first or last element on the row
                if j == 0 or j == i:
                    row.append(1)
                # For other elements sum the numbers in previous row
                else:
                    row.append(out[i-1][j-1] + out[i-1][j])
            out.append(row)
        return out
        