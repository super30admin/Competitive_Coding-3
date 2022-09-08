"""Time Complexity : O(n(logn))
   Space Complexity : O(1)
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No


   Your code here along with comments explaining your approach """
   
   class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        low = 0
        high = 0
        count = 0
        nums.sort()
        while low < len(nums) and high < len(nums):
            if low == high:
                high = high + 1
            elif abs(nums[low] - nums[high]) == k:
                count = count + 1
                
                low = low + 1
                high = high + 1
                
                while high < len(nums) and nums[high - 1] == nums[high]:
                    high = high + 1
                    
            elif abs(nums[low] - nums[high]) > k:
                low = low + 1
            elif abs(nums[low] - nums[high]) < k:
                high = high + 1
        return count
                