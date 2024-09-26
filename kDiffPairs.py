"""
//Time Complexity : O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        nums.sort()
        if len(nums)==0:
            return 0
        slow = 0
        count=0
        fast = 0
        n = len(nums)
        while(slow<n and fast<n):
            diff = nums[fast] - nums[slow]
            # if fast==slow:
            #     fast+=1
            if(fast==slow or diff<k):
                fast+=1
            elif(diff>k):
                slow+=1
            else:
                count+=1
                fast+=1
                slow+=1
                while(fast<n and nums[fast]==nums[fast-1]):
                    fast+=1
                while(slow<n and nums[slow]==nums[slow-1]):
                    slow+=1
        return count
    