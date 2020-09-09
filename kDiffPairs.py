# // Time Complexity : O(nlogn)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
 
#  Approach:
# 1. Add two pointers-> left at index 0 and right at position 1
# 2. Create an output counter
# 3. Sort the numbers list to get some order
# 4. Now, traverse through the nums list as follows:
#   -calculate difference of values at right and left
#   -if the difference is less than k, we need to move right pointer ahead to increase the difference (as the array is sorted); same for the case when left and right pointers point to same index
#   -if the difference is greater than k, we move left pointer ahead to reduce the difference
#   -if the difference is equal, we increase the ouput counter by 1 as we have found the pair and move left counter ahead
#   -also, if the value at current index and previous index of left pointer is equal, it indicates the pair is already been counted so we move the pointer ahead until it reaches a value that it hasn't encountered before(handling case of duplicates)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        left = 0
        right = 1
        output = 0
        
        nums.sort()
        
        while left<len(nums) and right<len(nums):
            
            diff = nums[right]-nums[left]
            
            if left == right or diff < k:
                right += 1
                
            elif diff > k:
                left += 1
                
            else:
                left +=1
                output += 1
                while left < len(nums) and nums[left]==nums[left-1]:
                    left += 1
            
        return output
                
        
        
        