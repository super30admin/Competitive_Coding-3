class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        freq = {}
        ans = 0
        for num in nums:
            if num not in freq:
                freq[num] = 0
            freq[num] += 1
        
        print(freq)
        for key in freq.keys():
            if k != 0:
                if key - k in freq and freq[key - k] != -1:
                    ans += 1
                if key + k in freq and freq[key + k] != -1:
                    ans += 1
            else:
                if freq[key] >= 2:
                    ans += 1

            freq[key] = -1
            
        return ans

# TC: O(n)
# SC: O(n)
