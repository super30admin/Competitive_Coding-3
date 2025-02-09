class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        res = 0
        freq = collections.Counter(nums)

        for num in freq:
            if k > 0 and num+k in freq:
                res += 1
            elif k == 0 and freq[num] > 1:
                res += 1
        
        return res