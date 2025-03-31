# Approach:
# For each row from 0 to numRows-1, start with a list of 1s.
# Then compute the inner elements by adding values from the previous row.
# Append the row to the result and return the result after numRows iterations.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []

        for i in range(numRows):
            temp = [1] * (i + 1)
            for j in range(1, i):
                temp[j] = result[i - 1][j - 1] + result[i - 1][j]
            result.append(temp)

        return result

# Time Complexity: O(numRows^2)
# Space Complexity: O(numRows^2)
