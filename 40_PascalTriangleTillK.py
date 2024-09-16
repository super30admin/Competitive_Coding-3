# accepted in leetcode
# time - O(N)- N is number of rows, space - O(N)
class Solution:
    def generate(self, numRows: int):
        result = []
        for i in range(numRows):  # iteration for rows
            row = []
            for j in range(i + 1):  # iteration for row items
                if j == 0 or j == i:  # for 1st and last row element it is 1, so append 1
                    row.append(1)
                else:  # for all other elements, add previous rows i-1 and i th value.
                    left = result[i - 1][j - 1]
                    right = result[i - 1][j]
                    row.append(left + right)

            result.append(row)
        return result

sol = Solution()
print(sol.generate(5))