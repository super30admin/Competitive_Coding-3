# O(n) time, O(n) space
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # {1: 2, 3: 1, 4: 1, 5: 1}
        # k=2
        # nums = [3,1,4,1,5]
        counter = Counter(nums)
        pairs=0
        for x in counter:
            if k != 0 and (x + k) in counter:
                pairs+=1
            elif k==0 and counter[x] >= 2:
                    pairs+=1
        
        return pairs