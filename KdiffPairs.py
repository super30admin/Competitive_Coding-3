"""
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i < j < nums.length
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.
"""

# Time Complexity : O(n log n)
# Space Complexity : O(1) 
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        

        nums = sorted(nums)

        # using 2 pointers
        low = 0
        high = 1
        res = 0

        # iterating till end of list
        while(low < len(nums) and high < len(nums)):
            
            # 3 conditions. If low and high element is greater, less than or equal to the target k

            # if both indexes are same, means nums[low] = nums[high]. problem says k is greater than 1. 
            # So increment high so we can compare it with low 
            # Also, if high - low elements value less than k, to make k equal to the value, we need to move to the left of list
            if(low == high or nums[high] - nums[low] < k):
                high += 1

            # if value is greater, to make it equal we increase low value
            elif(nums[high] - nums[low] > k):
                low += 1

            # if equal, we found 1 pair. So increment result. Also, to move to search next pair, increment low and check again 
            else:
                low += 1
                res += 1

                while(low < len(nums) and nums[low] == nums[low -1]):
                    low += 1
        
        return res

s = Solution()
result = s.findPairs([3,1,4,1,5], 2)
print(result)
