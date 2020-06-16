"""
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        i = 0 #2-pointer approach
        j = i + 1
        ct = 0 #count variable
        nums = sorted(nums)
        
        while i<len(nums) and j<len(nums):
            
            diff = abs(nums[i] - nums[j]) #getting the absolute difference 
            
            if i != j and diff == k: #if difference == k, increment count
                ct += 1
                
                i = i + 1 # increment slow pointer
                while i < len(nums) and nums[i-1] == nums[i]: #to keep check of duplicates
                    i = i + 1
                    
                j = i + 1 #place j immediately after i
                
            elif i == j or diff < k: #if difference < k, increment fast pointer as we want greater difference
                j = j + 1
            elif i == j or diff > k: #else decrement i as we want smaller difference
                i = i + 1
                
        return ct