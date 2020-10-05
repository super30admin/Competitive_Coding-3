#O(N) time and O(N) space where N is the length of nums array
from collections import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        frequencies = Counter(nums)
        count = 0
        for key,value in frequencies.items():
            if k > 0 and key + k in frequencies:
                count += 1
            elif k == 0:
                count += 1 if value > 1 else 0
        return count