# // Time Complexity :O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if(nums==[] and len(nums)==0):
            return 0
        hashmap={}
        for i in nums:
            if i in hashmap:
                hashmap[i]+=1
            else:
                hashmap[i]=1
        count =0
        for i in hashmap:
            if(k==0):
                if(hashmap[i]>=2):
                    count+=1
            else:
                complement=i-k
                if complement in hashmap:
                    count+=1
        return count
                