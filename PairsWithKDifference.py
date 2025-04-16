# Time Complexity: O(n)
# Space Complexity: O(n)
# Does this code run on Leetcode: Yes
# Did you face any problem while coding this: No

from typing import Counter, List


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        c = Counter(nums)
        print(c)
        count = 0
        if k == 0:
            for key, v in c.items():
                if v > 1:
                    count += 1
        else:
            for key, v in c.items():
                if k+key in c:
                    count += 1
        return count