# Time Complexity : O(n^2)
# Space Complexity : O(1)
class Solution:
    def generate(self, numRows):
        if numRows == 0:
            return []
        result = []
        i = 0
        while i < numRows:
            k = i + 1
            row = []
            if i == 0:
                row.append(1)
            else:
                prev = result[i - 1]
                row.append(1)
                for j in range(1, k - 1):
                    row.append(prev[j - 1] + prev[j])
                row.append(1)
            result.append(row)
            i += 1
        return result

solution = Solution()

# Example 1:
numRows = 5
print(solution.generate(numRows))  # output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

# Example 2:
numRows = 3
print(solution.generate(numRows))  # output: [[1], [1, 1], [1, 2, 1]]

# Example 3:
numRows = 6
print(solution.generate(numRows))  # output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1], [1, 5, 10, 10, 5, 1]]
