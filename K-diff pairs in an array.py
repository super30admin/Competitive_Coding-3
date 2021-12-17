# Time Complexity: O(n)
# Space Complexity : O(n)

from collections import Counter
class Solution:
    def findPairs(self, nums, k: int) -> int:
        # Initialize a counter
        c = Counter(nums)
        result = 0

        # Exceptional case when k=0
        if k == 0:
            for key, v in c.items():
                if v > 1:
                    result += 1

        # Normal case
        else:
            for key, v in c.items():
                if key + k in c:
                    result += 1

        return result