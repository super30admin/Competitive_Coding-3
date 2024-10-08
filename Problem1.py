# Time Complexity = O(n)  Space Complexity = O(n)
from collections import Counter
class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:
        count = 0
        c = Counter(nums)
        for key, val in c.items():
            if k == 0:
                if val > 1:
                    count += 1
            else:
                if key + k in c:
                    count += 1

        return count

