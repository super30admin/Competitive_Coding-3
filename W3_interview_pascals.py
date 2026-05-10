class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        result = []

        # Insert 0s for all the rows in in creasing order
        for i in range(numRows):
            row = [0] * (i + 1)
            result.append(row)

        # Insert 1s in first and last index of each row
        for i in range(numRows):
            result[i][0] = 1
            result[i][-1] = 1

        # Fill the middle values
        for i in range(2, numRows):
            for j in range(1, i):
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j]

        return result

# Time complexity: O(numRows^2)
# Space complexity: O(numRows^2), because we store the full triangle


