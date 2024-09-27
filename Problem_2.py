# 532. K-diff Pairs in an Array

# Code:

# Approach: Similar to two-sum, take the counter of all the elements in the given array. Iterate over the array, add k to each val and see if it's present in the mapping.
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k<0:
            return 0
        
        mapping = collections.Counter(nums)
        res = 0
        
        if k==0:
            for k,v in mapping.items():
                if v>=2:
                    res+=1
            
            return res
        
        for i in set(nums):
            if i+k in mapping:
                res+=1
        
        return res
            
# Time Complexity: O(N) + O(N) = O(N)
# Space Complexity: O(N)
# Accepted on Leetcode: Yes
# Difficulty faced: No