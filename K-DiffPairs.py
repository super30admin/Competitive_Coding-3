# Time Complexity: O(n)
# Space Complexity : O(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        map ={}
        
        for a in nums:
            
            if a not in map:
                map[a] = 1
            else:
                map[a] +=1
        
        
       
        count = 0
        for i in map.keys():
            print(i)
            if k ==0:
                if map.get(i) >1:
                    count+=1
            else:
                if i +k in map:
                    count+=1
                    
            
        
        print(count)
        return count
            
            
            
        