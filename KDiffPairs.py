# Time Complexity : O(NlgN)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        """
        Can use two for loops to find pairs - O(n^2)
        Sort the array and can use two pointers... O(NlgN)
        Will try to solve/optimize in O(N) solution.. (USE HASHMAP)

        """
        count = 0
        if not nums:
            return count 

        left = 0 
        right = 0 
        nums.sort() 
        # need to find difference so right - left.. and move pointers according to difference
        while left < len(nums) and right < len(nums):
            if left == right:
                right += 1
                continue

            if nums[right]-nums[left] == k:
                count += 1
                left += 1
                right += 1
                while right < len(nums) and nums[right] == nums[right-1]:
                    right += 1
            elif nums[right]- nums[left] < k: 
                right += 1
            else:
                left += 1 

        return count
