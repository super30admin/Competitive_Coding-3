#Used python's Counter collection to get frequency of all elements, and then checked if 
#i+k exists in the counter, if it does res+=1
#TC and SC are both O(n)

from collections import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        res=0
        counter=Counter(nums)
        for i in counter:
            if k>0 and i+k in counter:
                res+=1
            elif k==0 and counter[i]>1:
                res+=1
        return res