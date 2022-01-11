# TC: O(N + M) where N = nums array and M = hashmap loop
# SC: O(N)

from typing import List


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashmap = {}
        pairCount = 0
        #frequency counter
        for i in range(len(nums)):
            if nums[i] in hashmap:
                hashmap[nums[i]] += 1
            else:
                hashmap[nums[i]] = 1
        
    # loop through hashmap
        for num, counter in hashmap.items():
            if counter > 1 and k == 0:
                pairCount += 1
            elif k >= 1 and num + k in hashmap:
                print(num + k)
                pairCount += 1
        return pairCount