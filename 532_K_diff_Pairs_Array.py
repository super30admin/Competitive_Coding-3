"""
TC-> O(n)
SC -> O(n)
"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        cnt = 0
        hm = Counter(nums)
        if k == 0:
            for val in hm.values():
                if val > 1:
                    cnt += 1
        elif k > 0:
            for num in hm:
                if num - k in hm:
                    cnt += 1
        return cnt
