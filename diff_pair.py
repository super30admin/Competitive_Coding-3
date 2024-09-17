# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach





class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count=0
        slow=0
        fast=0
        nums=sorted(nums)
        while slow<len(nums) and fast<len(nums):
            diff=nums[fast]-nums[slow]
            if slow==fast or diff<k:
                fast+=1
            elif diff>k:
                slow+=1
            else:
                count+=1
                fast+=1
                slow+=1
                while fast<len(nums) and nums[fast]==nums[fast-1]:
                    fast+=1
                    print(fast)
        return count