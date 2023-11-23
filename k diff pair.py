# // Time Complexity : O(N LogN)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : NO


# // Your code here along with comments explaining your approach
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:

        nums = sorted(nums)

        left = 0
        right = 1

        result = 0

        while (left < len(nums) and right < len(nums)):
            if (left == right or nums[right] - nums[left] < k):
                # List item 1 in the text
                right += 1
            elif nums[right] - nums[left] > k:
                # List item 2 in the text
                left += 1
            else:
                # List item 3 in the text
                left += 1
                result += 1
                while (left < len(nums) and nums[left] == nums[left - 1]):
                    left += 1

        return result