"""
Problem:
https://leetcode.com/problems/k-diff-pairs-in-an-array/submissions/

Approach:

1. sort the array
1. Take 2 pointers, slow and fast pointing the starting of the array
2. if fast==slow then increment fast
3. then we take the absolute differe, if abs diff is k then we increment the count and move the fast pointer untill we encounter a different number than previous
4. if abs diff is less than k we increment fast pointer
5. if abs diff is greater than k, we increment slow pointer
6. return count

"""

# Time Complexity : O(n*log(n)) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if len(nums)<2:
            return 0
        
        count =0
        slow=0
        fast=0
        n = len(nums)
        nums.sort()
        
        while(slow<n and fast<n):
            if slow==fast:
                fast+=1
            else:
                absDif = abs(nums[fast]-nums[slow])
                if absDif == k:
                    count+=1
                    fast+=1
                    while (fast<n and nums[fast]==nums[fast-1]):
                        fast+=1
                    
                elif absDif < k:
                    fast+=1
                else:
                    slow+=1
        return count