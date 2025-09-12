# Time Complexity : O(NlogN)
# Space Complexity : O(1)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am sorting the array and using two pointers to find the pairs with difference k.
# If the difference is less than k, I am moving the right pointer to increase the difference
# If the difference is more than k, I am moving the left pointer to decrease the difference
# If the difference is equal to k, I am adding the pair to a set to avoid duplicates and moving both pointers forward.  
# In the end, I am returning the length of the set which contains the unique pairs.

from typing import List
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        seen = set()
        i = 0
        j =  1
        while i < len(nums) and j < len(nums):
            if i == j or abs(nums[i] - nums[j]) < k:
                print("j",abs(nums[i] - nums[j]))
                j += 1
            elif abs(nums[i] - nums[j]) > k:
                print("i",abs(nums[i] - nums[j]))
                i += 1
            else:
                seen.add((nums[i] ,nums[j]))
                i += 1
                j += 1
        print(seen)
        return len(seen)
        