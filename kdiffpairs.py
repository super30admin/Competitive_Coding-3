# Time Complexity : O(n)
# Space Complexity : O(1)
from typing import List


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0
        seen = set()
        pairs = set()
        for num in nums:
            if num - k in seen:
                pairs.add((num-k , num)) # we are making it sure that numbers are stored in sorted order, lowest and then maximum to avoid duplicates
            if num + k in seen:
                pairs.add((num , num +k))
            seen.add(num)
        return len(pairs)
