"""
Initialize a list of lists where each row starts and ends with 1.
For each row from index 2, find inner values using the sum of two elements from the previous row.
Return the entire triangle after filling all rows.
"""
"""
Time Complexity: O(n^2) - A row i goes through i elements
Space Complexity: O(n^2) -  To store in a 2D list
"""


class pascalTriangle:
    def generate(self, numRows: int) -> list[list[int]]:
        dp = [[1] * (i + 1) for i in range(numRows)]

        for i in range(2, numRows):
            for j in range(1, i):
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]

        return dp

if __name__=="__main__":
    obj = pascalTriangle()
    numRows = 5
    print(obj.generate(numRows))