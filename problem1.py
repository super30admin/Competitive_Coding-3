TC:O(n^2)
SC:O(1)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []

        result = [None] * numRows
        result[0] = [1]

        for i in range(1, numRows):
            num = [1] * (i + 1)
            for j in range(i + 1):
                if j != 0 and j != i:
                    num[j] = result[i - 1][j - 1] + result[i - 1][j]

            result[i] = num

        return result
