# Time Complexity : O(nlogn)
# Space Complexity : O(1)
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
        count = 0
        while slow < len(nums) and fast < len(nums):
            if (slow == fast or nums[fast] - nums[slow] < k):
                fast += 1
            elif nums[fast] - nums[slow] > k:
                slow += 1
            else: 
                count += 1
                slow += 1
                fast += 1

                while fast < len(nums) and nums[fast] == nums[fast-1]: fast+= 1
        return count