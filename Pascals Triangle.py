""""// Time Complexity : O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[]] * numRows
        for i in range(len(result)):
            result[i] = [1] * (i + 1)

        for i in range(2, len(result)):
            for j in range(1, len(result[i]) - 1):
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j]
        return result

#Time Complexity: O(m*n)
#Space Complexity: O(m*n)
# class Solution:
#     def generate(self, numRows: int) -> List[List[int]]:
#         result = [[1]]
#         for i in range(1,numRows):
#             l = []
#             l.append(1)
#             for j in range(1,i):
#                 l.append(res[i-1][j-1] + res[i-1][j])
#             l.append(1)
#             result.append(l)
#         return result