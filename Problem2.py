# K-diff Pairs in an Array

# Approach
# create a hashmap with element in array and its frequency.
# Iterate through the key in hashmap and check if i+k is present in hmap. If yes, increment res. If k == 0 and counter of that key is > 1, increment res
# return res

# TC: O(n)
# SC: O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hmap = {}
        res = 0
        for i in nums:
            if i in hmap:
                hmap[i] += 1
            else:
                hmap[i] = 1
        
        for i in hmap:
            if k > 0 and i+k in hmap:
                res += 1
            elif k == 0 and hmap[i] > 1:
                res += 1
        return res