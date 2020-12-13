# K-diff Pairs in an Array

# Time Complexity : O(N log N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes, with Runtime: 80 ms and Memory Usage: 15.4 MB
# Any problem you faced while coding this : Initally yes, After understanding no.
# Your code here along with comments explaining your approach
# Approach
"""
Sorting the array and using two pinters Fast and Slow and establishing the cases by calcculating difference 
between elements i.e if difference == k than variable count, slow pointer and fast pointer
will be incremented, If difference is more than slow pointer will be incremented and
if less than fast pointer will be incremented. 

"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums=sorted(nums)
        count=0
        slow=0
        fast=1
        n=len(nums)
        while(slow < n and fast < n):
            if(slow==fast or nums[fast]-nums[slow] < k): # Case 1
                fast=fast+1
            elif(nums[fast]-nums[slow] > k): # Case 2
                slow=slow+1
            else:                       # Case 3
                count=count+1
                slow=slow+1
                fast=fast+1 
                while(slow<n and nums[slow]==nums[slow-1]): # Checking for uniqueness
                    slow=slow+1
        return count