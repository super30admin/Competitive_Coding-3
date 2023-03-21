# Time Complexity - O(n)
# Space Complexity - O(n)


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        dictionary = {}
        count = 0
        for i in range(len(nums)):
            if nums[i] in dictionary : 
                dictionary[nums[i]] += 1 
                

            else :
                dictionary[nums[i]] = 1 
        
        for key,value in dictionary.items(): 
            if k == 0 :
                if value > 1: 
                    count += 1
                
            else:
                if key + k in dictionary  : 
                   count += 1  
        
        return count

            
