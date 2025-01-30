# Time complexity - O(n)
# Space complexity - O(n)

# Approach - Maintain a hashmap with (n: count) entries. Only special case to take care of, 
# if k == 0 and nums is made of all same values (eg: [1,1,1,1]), then need to check if multiple
# same values exist, coz otherwise the n will be computed against itself everytime.

from typing import List
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        result = 0
        hashmap = {}

        for n in nums:
            if n not in hashmap:
                hashmap[n] = 0
            hashmap[n] += 1

        for n in hashmap:
            if k > 0 and n + k in hashmap:
                result += 1
            elif k == 0 and hashmap[n] > 1:
                result += 1
            
        return result