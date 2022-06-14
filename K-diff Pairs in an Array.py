""""// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""
class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:
        dictu = {}
        pairs = set()
        for i in nums:
            if i not in dictu:
                dictu[i] = 1
            else:
                dictu[i] += 1
        for i in dictu:
            if k != 0 and i + k in dictu:
                pairs.add(tuple(sorted((i, i+k))))
            elif k == 0 and i + k in dictu and dictu[i+k] > 1:
                pairs.add(tuple(sorted((i, i+k))))
        return len(pairs)
# class Solution:
#     def findPairs(self, nums: List[int], k: int) -> int:
#         d={}
#         s=set()
#         count=0
#         for i in range(len(nums)):
#             if nums[i]-k in d and (nums[i]-k,nums[i]) not in s and (nums[i],nums[i]-k) not in s:
#                 count+=1
#                 s.add((nums[i]-k, nums[i]))
#             if nums[i]+k in d and (nums[i]+k,nums[i]) not in s and (nums[i],nums[i]+k) not in s:
#                 count+=1
#                 s.add((nums[i]+k, nums[i]))
#             d[nums[i]]=1
#         return count

#
# class Solution:
#     def findPairs(self, nums: List[int], k: int) -> int:
#         dictu = {}
#         count = 0
#         for i in nums:
#             if i not in dictu:
#                 dictu[i] = 1
#             else:
#                 dictu[i] += 1
#         for i in dictu:
#             if i + k in dictu and k != 0:
#                 count += 1
#             if k == 0 and dictu[i + k] > 1:
#                 count += 1
#         return count


