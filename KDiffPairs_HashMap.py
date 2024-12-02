# TC: O(N) since we are iterating over the array to insert elements and theor occurences in the hashmap and also during checking the complement value. 
# SC: O(N) since we are using a hashmap to store the mappings of value and no. of occurences of the value in input array.

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if not nums or len(nums) == 0:
            return 0
        
        count = 0
        hmap = collections.Counter(nums)
        
        for key in hmap:
            if k > 0 and key + k in hmap:
                count += 1
            elif k == 0 and hmap[key] > 1:
                count += 1
        return count
