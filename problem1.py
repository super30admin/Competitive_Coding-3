#time comlexity: O(n^2)
#space complexity:O(n^2)
#submit on leetcode:yes


class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        if numRows == 0:
            return []

        result = [[1]]

        for i in range(1, numRows):
            prev_row = result[-1]
            new_row = [1]

            for j in range(1, i):
                new_row.append(prev_row[j - 1] + prev_row[j])

            new_row.append(1)
            result.append(new_row)

        return result

sol = Solution()
output = sol.generate(5)
print(output)