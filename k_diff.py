class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
      
        hashmap = {}
        
        for item in nums:
            
            if item in hashmap:
                hashmap[item]+=1
            
            else:
                hashmap[item]=1
        
        
        result = 0
        
        for i in hashmap:

            if i-k in hashmap and k>0:
                result+=1
                
            if k==0 and hashmap[i]>1:
                result+=1
    
        
        return result

		
#Time - O(n)
#Space - O(n)