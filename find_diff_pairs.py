# TIme complexity - O(n)
# Space complexity - O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hset = set()
        res = set()
        for each in nums:
            val = None
            if each + k  in hset:
                val = sorted([each, each + k])
                res.add(tuple(val))
            if each - k in hset:
                val = sorted([each, each - k])
                res.add(tuple(val))
            hset.add(each)
        return len(res)
