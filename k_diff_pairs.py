# O(N) TIME AND O(N) SPACE WHERE N IS LEN(NUMS)
from collections import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        counts = Counter(nums)
        pairs = 0
        for num,count in counts.items():
            if k == 0:
                pairs += 1 if count > 1 else 0
            elif num + k in counts:
                pairs += 1
        return pairs