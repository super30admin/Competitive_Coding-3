class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        dataStore = dict()
        
        for num in nums:
            
            if num not in dataStore:
                dataStore[num] = 1
        
            else:
                dataStore[num]+=1
        
        counter = 0
        for num in nums:
            
            if num-k in dataStore:
                if k!=0:
                    counter += 1
                    dataStore.pop(num-k)
        
        if k==0:
            for i in dataStore:
                if dataStore[i]>1:
                    counter+=1
        
            
        return counter
    
#  Approach is to store nums in hashmap and then for each num, check if num+k or num-k is in the hashmap. keep count if it is found and pop once done so as to remove repeats.
#  for k==0, look for hashmap where value is more than one for any key. If it is, increase count by 1
# Time complexity is O(n)
        
        
