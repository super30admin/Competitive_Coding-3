# Time Complexity : O(numRows^2)
# Space Complexity : O(1), While O(numRows^2) space is used to store the output triangle, it is genrally not counted towards space complexity.
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        # Tabulation Approach

        dp = []

        for i in range(numRows):
            row = []
            for j in range(i + 1):
                if j == 0 or j == i:
                    row.append(1)
                else:
                    value = dp[i - 1][j - 1] + dp[i - 1][j]
                    row.append(value)
            dp.append(row)

        return dp

# ------------------------------------------------------------------------------------------

        # Memoization Approach
        # Time Complexity: O(numRows^2)
        # Space Complexity: O(numRows^2) for memo table + O(numRows) for recursion stack
        # While O(numRows^2) is used for output, it is not counted in space complexity.

        # memo = [[-1 for _ in range(i + 1)] for i in range(numRows)]

        # def helper(row, col):
        #     if col == 0 or col == row:
        #         return 1
        #     if memo[row][col] != -1:
        #         return memo[row][col]
        #     memo[row][col] = helper(row - 1, col - 1) + helper(row - 1, col)
        #     return memo[row][col]

        # res = []
        # for i in range(numRows):
        #     row = []
        #     for j in range(i + 1):
        #         row.append(helper(i, j))
        #     res.append(row)

        # return res

# ------------------------------------------------------------------------------------------

        # Recursive Approach
        # Time Complexity: O(2^numRows) due to overlapping subproblems
        # Space Complexity: O(numRows) for recursion stack
        # Output space O(numRows^2) is not counted towards space complexity.

        # def helper(row, col):
        #     if col == 0 or col == row:
        #         return 1
        #     return helper(row - 1, col - 1) + helper(row - 1, col)

        # res = []
        # for i in range(numRows):
        #     row = []
        #     for j in range(i + 1):
        #         row.append(helper(i, j))
        #     res.append(row)

        # return res


if __name__ == "__main__":
    sol = Solution()
    print(sol.generate(5))  # Output: [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]
    print(sol.generate(1))  # Output: [[1]]
