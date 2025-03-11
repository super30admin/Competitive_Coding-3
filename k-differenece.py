class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k<0:
            return 0
        seen =set()
        pair=set()
        for i in nums:
            if k ==0:
                if i in seen:
                    pair.add(i)
            else:
                if i+k in seen:
                    pair.add((i,i+k))
                if i-k in seen:
                    pair.add((i-k,i))
            seen.add(i)
        return len(pair)