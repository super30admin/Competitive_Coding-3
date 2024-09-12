# Time Complexity : O(nlogn)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        start,end,out = 0,1,0
        nums = sorted(nums)
        while start < len(nums) and end <len(nums):
            if start == end or nums[end]-nums[start] < k:
                end+=1
            elif nums[end]-nums[start] > k:
                start+=1
            else:
                start+=1
                out+=1
                while start<len(nums) and nums[start] == nums[start-1]:
                    start+=1
        return out
