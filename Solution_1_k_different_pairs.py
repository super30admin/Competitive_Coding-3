// Time Complexity : O(n) 
// Space Complexity : O(k) k=unique values in dictionary
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


'''
1. Use a dictionary to keep track of repeating values

2. loop through keys to see value, value+target exist in dictionary keys,
   if so increase the pair_count.

3. If target is zero, check if same value number is presentmore than once
   and  if present, increment pair_count 
   
4. return the pair count

'''




class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        h={}
        for i in nums:
            if i in h.keys():
                h[i]=h[i]+1    
            else:
                h[i] =1
                
        result = 0
        
        for i in h.keys():
            
            # val= i, target = i+k
            
            if k>0 and i+k in h.keys():
                result = result +1
            
            else:
                if k==0 and h[i]>1:
                    result = result +1
                
        return result