#using hashmap
#time- O(n) size of hashmap
#space- O(n) extra space for hashmap
import collections 
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #take count of each element of nums
        d=list(set(nums))
        
        #check for d[i]+k exist in d and  and k>0  
        res=0
        for i in range(0,len(d)):
            for j in range(i+1,len(d)):
                if abs(d[i]-d[j])==k:
                    res=res+1
        return res
        
