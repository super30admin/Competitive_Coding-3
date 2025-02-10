# Problem 2 : K-diff Pairs in an Array
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
'''
It took a while to come up with the idea of using two sets: one for tracking visited elements and the other for storing unique 
elements.
'''

# Your code here along with comments explaining your approach

# Use of 2 sets
from typing import List

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        # Store the number is visited
        visitedSet = set()
        # Stores small numbers of the pair in the set
        uniqueSmallNumberSet = set () 
        for n in nums:
            # Consider n is bigger number in pair so checking if the smaller number is in visited set and if it is present then we will store the smaller number in the unique set 
            if n-k in visitedSet:
                uniqueSmallNumberSet.add(n-k)
            # Consider n is smaller number in pair so checking if the smaller number is in visited set and if it is present then we will store the n in the unique set 
            if n+k in visitedSet:
                uniqueSmallNumberSet.add(n)
            
            # Will store n in visitedSet and mark the number as visited
            visitedSet.add(n)
        
        # Will return the length of unique set which will give the number of k-diff pairs in the array
        return len(uniqueSmallNumberSet)
    


# Brute Force it take O(n^2) times
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0
        n = len(nums)
        # Store unique set for the pair 
        uniqueSet = set()
        
        # Checking for every pair of element in the list
        for i in range(n):
            for j in range(i + 1, n):
                # Checking the difference is equal to k 
                if abs(nums[i] - nums[j]) == k:
                    # While storing the number pair will store the maximum number first and then minimum number next to avoid duplicates
                    if (nums[i]> nums[j]):
                        uniqueSet.add((nums[i], nums[j]))
                    else:
                        uniqueSet.add((nums[j], nums[i]))
        
        return len(uniqueSet)