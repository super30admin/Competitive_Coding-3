TC: O(n)
SC: O(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        counter = collections.Counter(nums)
        res=0
        for i in counter.keys():
            if k> 0 and i+k in counter.keys():
                res+=1
            elif k==0 and counter[i]>1:
                res+=1
        return res