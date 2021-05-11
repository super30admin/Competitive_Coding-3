from collections import defaultdict
from typing import List

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:

        if nums is None or len(nums) == 0: return -1
        frequency_map = defaultdict(int)
        count = 0
        for element in nums:
            frequency_map[element] += 1
        for element in nums:

            if k > 0 and k + element in frequency_map.keys():

                count += 1
            elif k == 0 and frequency_map[element] > 1:
                count += 1

        return count
