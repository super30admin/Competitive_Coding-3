# time: O(n) space: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = Counter(nums)
        c = 0

        if k == 0:  # [1,3,1,5,4], k = 0
            for i in count:
                if count[i] > 1:
                    c += 1
        else:
            for i in count:
                if k > 0 and i + k in count:
                    c += 1
        return c


