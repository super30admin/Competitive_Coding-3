# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
# Your code here along with comments explaining your approach
class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:
        dictu = {}
        count = 0
        for i in nums:
            if i not in dictu:
                dictu[i] = 1
            else:
                dictu[i] += 1
        for i in dictu:
            if k != 0 and i + k in dictu:
                count += 1
            elif k == 0 and i + k in dictu and dictu[i+k] > 1:
                count += 1
        return count


check = Solution()
print(check.findPairs([3, 1, 4, 1, 5], 2))


# for finding pairs
# class Solution:
#     def findPairs(self, nums: list[int], k: int):
#         dictu = {}
#         pairs = set()
#         for i in nums:
#             if i not in dictu:
#                 dictu[i] = 1
#             else:
#                 dictu[i] += 1
#         for i in dictu:
#             if k != 0 and i + k in dictu:
#                 pairs.add(tuple(sorted((i, i+k))))
#             elif k == 0 and i + k in dictu and dictu[i+k] > 1:
#                 pairs.add(tuple(sorted((i, i+k))))
#         return len(pairs), pairs
#
#
# check = Solution()
# x = check.findPairs([3, 1, 4, 1, 5], 2)
# print('length of unique pairs is', x[0])
# print('pairs is/are', x[1])
