#Time Complexity : O(Nlogn) for sorting and O(N) for traversing the nums array
#Space Complexity : O(1)

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        nums.sort()
        slow = 0
        fast = 0
        count =0
        n = len(nums)
        
        while(slow < n and fast < n):
            if slow == fast or abs(nums[fast] - nums[slow]) < k:
                fast+=1
            elif abs(nums[fast] - nums[slow])>k:
                slow+=1
            elif abs(nums[fast] - nums[slow]) ==k:
                fast+=1
                slow+=1
                count+=1
                while(fast< n and nums[fast]==nums[fast-1]):
                    fast+=1
        return count