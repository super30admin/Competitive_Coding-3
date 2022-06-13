# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
# Your code here along with comments explaining your approach
class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        result = [[]] * numRows
        for i in range(numRows):
            result[i] = [1] * (i+1)
        for i in range(2, len(result)):
            for j in range(1, len(result[i])-1):
                result[i][j] = result[i-1][j-1] + result[i-1][j]
        return result


check = Solution()
print(check.generate(5))


# class Solution:
#     def getRow(self, rowIndex: int) -> list[int]:
#         result = []
#         for i in range(rowIndex):
#             result.append([1]*(i+1))
#             for j in range(1, len(result[i])-1):
#                 result[i][j] = result[i-1][j-1] + result[i-1][j]
#         return result


# class Solution:
#     def generate(self, numRows: int) -> list[list[int]]:
#         result = [[]] * numRows
#         for i in range(numRows):
#             result[i] = [0] * (i+1)
#         for i in range(len(result)):
#             result[i][0], result[i][-1] = 1, 1
#             for j in range(1, len(result[i])-1):
#                 result[i][j] = result[i-1][j-1] + result[i-1][j]
#         return result
#
#
# check = Solution()
# print(check.generate(5))
