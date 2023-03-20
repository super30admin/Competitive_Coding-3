# TC: O(n2)
# SC: O(1)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []

        for r in range(numRows):
            temp = [0] * (r + 1)
            temp[0] = 1
            temp [-1] = 1

            for j in range(1, len(temp) - 1):
                temp[j] = result[r - 1][j - 1] + result[r - 1][j]

            result.append(temp)
        return result