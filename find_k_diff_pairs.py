# Time Complexity : O(N) where N is numbers in the array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    
    def findPairs(self, nums: List[int], k: int) -> int:
        hash_map = {}
        count = 0
        for num in nums:
            hash_map[num] = hash_map.get(num, 0) + 1
        for key, value in hash_map.items():
            hash_map[key] = value - 1
            if (key - k) in hash_map and hash_map[key - k] > 0:
                count+=1
            hash_map[key] = value + 1
        return count