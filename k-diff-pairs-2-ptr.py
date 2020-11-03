# Time Complexity: O(n log n)
# Space Complexity: O(1) [If we consider the space required for sorting - O(n) - depends on the sorting algorithm used]
# Approach:
# Sort the array
# Maintain two pointers - starting from the first and second index
# Compute the difference - if it's greater than k, increase the range (increment the right pointer)
# If it's less than k, decrease the range (increment left pointer)
# To avoid duplicates, increment the right(or left) pointer till numbers are equal

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        left = 0
        right = 1
        nums.sort()
        res = 0
        while left < len(nums) and right < len(nums):
            diff = nums[right] - nums[left]
            if left == right or diff < k: # Increase the range
                right += 1
            else:
                if diff > k: # Decrease the range
                    left += 1
                else: # result found, increment right till numbers are duplicates
                    res += 1
                    right += 1
                    while right < len(nums) and nums[right-1] == nums[right]:
                        right += 1
        return res