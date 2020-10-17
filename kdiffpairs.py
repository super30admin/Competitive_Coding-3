"""
Time : O(N)
Space : O(N)
Leetcode : yes
Any issues while solving : no
"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        # Counter from collections
        
        # Create hashmap index->count
        counter = collections.Counter(nums)
        c = 0

        for key, value in counter.items():
            if k == 0:
                if value > 1:
                    c += 1
            else:
                if (key + k) in counter:
                    c += 1
                
        return c