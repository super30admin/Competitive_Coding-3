# Time Complexity: O(n^2), where n is the numRows
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []

        result = []

        for i in range(numRows):
            row = []

            for j in range(i + 1):
                # first and last element of the row is 1
                if j == 0 or j == i:
                    row.append(1)
                # jth element of the current row is the sum of jth and (j-1)th element of previous row
                else:
                    row.append(result[i - 1][j - 1] + result[i - 1][j])

            result.append(row)

        return result

