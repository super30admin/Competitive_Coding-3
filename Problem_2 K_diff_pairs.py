# // Time Complexity : O(nlogn)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach
# Using 2 pointers approach

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums = sorted(nums)         #Sort the numbers
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
                #duplicate pairs are not counted repeatedly
                while left < len(nums) and nums[left] == nums[left - 1]:
                    #Increment left pointer as long as left points to number which is equal to the previous one.
                    left += 1
        return result

