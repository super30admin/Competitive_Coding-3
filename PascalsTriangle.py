# Time complexity : O(n*m) where n is the numRows and m is the numColumns
# Space complexity : O(n*m)

class Solution:
    def generate(self, numRows):
        result = [[1]*i for i in range(1, numRows+1)]

        for i in range(1, numRows):
            for j in range(1, i):
                result[i][j] = result[i-1][j-1]+result[i-1][j]

        return result


solution = Solution()
print(solution.generate(5))
