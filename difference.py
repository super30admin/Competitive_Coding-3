# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : a bit 



class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        dict_a = dict()
        count = 0
        
        for i in range(len(nums)):
            if (nums[i] in dict_a):
                val = dict_a.get(nums[i]) + 1 
                dict_a[nums[i]] = val
            else:
                dict_a[nums[i]] = 1
        
        for i in dict_a.keys():
            temp = k+i
            if(k>0 and temp in dict_a):
                count+=1
            if(k==0 and dict_a.get(i)>1):
                count+=1
                
            
             
        
        return count