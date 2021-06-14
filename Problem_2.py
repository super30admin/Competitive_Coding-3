from typing import List
# For getting all rows of Pascal's triangle
# class Solution:
#     def generate(self, numRows: int) -> List[List[int]]:
#         result = []
        
#         for i in range(1, numRows+1):
#             arr = [None for _ in range(i)]
#             arr[0] = 1
#             arr[-1] = 1

#             for j in range(1, len(arr) - 1):
#                 arr[j] = result[i - 2][j - 1] + result[i - 2][j]    
#             result.append(arr)
#         return result

# obj = Solution()
# print(obj.generate(4))

# Time Complexity : O(n * n)
# Space Complexity : O(1) - no extra space, only space used is to store result

class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        if rowIndex == 0:
            return [1]
        if rowIndex == 1:
            return [1,1]

        result = [1 for _ in range(rowIndex + 1)]
        
        for j in range(2, rowIndex+1):
            k = j - 1
            while k >= 1:
                result[k] = result[k-1] + result[k]
                k -= 1

        return result
        
obj = Solution()
print(obj.getRow(4))

# Time Complexity : O(n * n)
# Space Complexity : O(1) - no extra space, only space used is to store result