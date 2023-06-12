# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to create a frequency hashmap/dict and store the frequence then find the diff of target in hashmap and if its present
# increment the count. When k=0 is a special case handled separately 

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        d={}
        for i in nums:
            if i in d:
                d[i]=d[i]+1
            else:
                d[i]=1
        
        print(d)
        c=0
        for i in d:
            if(k==0):
                if(d[i-k]>=2):
                    c+=1
            else:
                if (i-k) in d:
                    c+=1
        print(c)
        return c

        