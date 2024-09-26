from typing import List 
# Time Complexity : O(n), Where n is the number of elements in the nums array
# Space Complexity : O(n), Where n is the number of elements in the nums array
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hmap={}#This is the hashmap which we store the elements and there frequency
        count=0
        for i in nums:
            if(i in hmap):
                hmap[i]+=1
            else:
                hmap[i]=1
                
        #print(hmap)
        #Here i will iterate through the all the elements in hmap, Try find where it complements are present in the hmap, If yes we will increment the count 
        for i in hmap:
            comp1=i-k
            comp2=i+k
            if(comp1 in hmap):
                if(i==comp1):
                    if(hmap[i]>=2):
                        count+=1
                else:
                    count+=1
            if(comp2 in hmap):
                if(i==comp2):
                    if(hmap[i]>=2):
                        count+=1               
                else:
                    count+=1
        #Here we dividing by two because we have counted the each pair twice
        return int(count/2)           