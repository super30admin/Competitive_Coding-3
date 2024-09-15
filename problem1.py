#using hashmap
#time- O(n) size of hashmap
#space- O(n) extra space for hashmap
import collections 
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #take count of each element of nums
        d=collections.Counter(nums)
        #check for d[i]+k exist in d and  and k>0  
        res=0
        for i in d:
            if (i+k in d and k>0) or (k==0 and d[i]>1):
                res=res+1
        return res
        
