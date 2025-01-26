# Sort the array and two pointers on 0th and 1st array. if the difference is smaller appedn the right pointer and if it's greater append left pointter if it's equal append left and result counter. if the appended left is equal to previous we keep appending to avoid duplicates
# TC: O(NlogN)
# SC: O(1)
# Yes this worked in leetcode

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums = sorted(nums)
        left = 0
        right = 1
        result = 0
        while left < len(nums) and right < len(nums):
            if left == right or nums[right] - nums[left] < k:
                right += 1
            elif nums[right] - nums[left] > k:
                left += 1
            
            else:
                left += 1
                result += 1
                while left < len(nums) and nums[left] == nums[left - 1]:
                    left += 1

        return result