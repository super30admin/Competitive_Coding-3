# TC - O(n)
# SC - O(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0
        
        freq_map = {}
        for num in nums:
            freq_map[num] = freq_map.get(num, 0) + 1
        
        count = 0
        if k == 0:
            for freq in freq_map.values():
                if freq > 1:
                    count += 1
        else:
            for num in freq_map.keys():
                if num + k in freq_map:
                    count += 1
        
        return count
