# Time complexity is O(n) n is the numRows
# Space complexity is O(n)

class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        result = []
        if numRows >= 1:
            result.append([1])
        if numRows >= 2:
            result.append([1, 1])

        for i in range(2, numRows):
            temp = [1]
            for j in range(len(result[i-1])-1):
                temp.append(result[i-1][j] + result[i-1][j+1])
            temp.append(1)
            result.append(temp)
        return result
