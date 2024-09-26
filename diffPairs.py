# Time Complexity : O(N) 
# Space Complexity :    O(N)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if (len(nums))==0:
            return 0
        
        hashmap = {}
        count = 0
        for i in range(len(nums)):
            if nums[i] not in hashmap:
                hashmap[nums[i]] = 1
            else:
                hashmap[nums[i]]+=1
        
        for i in range(len(nums)):
            if k==0:
                if k+nums[i] in hashmap and hashmap[k+nums[i]]>1:
                    count+=1
                    hashmap.pop(nums[i])

            else:
                if k+nums[i] in hashmap:
                    count+=1
                    hashmap.pop(k+nums[i])
        return count
            
            
                
                    
                    
        