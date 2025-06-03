# // Time Complexity :O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

# https://leetcode.com/problems/k-diff-pairs-in-an-array/
# // Your code here along with comments explaining your approach
# There are multiple solutions for this problem , one being sorting and doing BS for k-nums[i] That would be O(NlogN) and space for this would be O(1) 
# But I followed doffernt approach with time and space being O(N,N) use hash map (to retirve nums[i]+k in O(1), here we can also do nums[i]-k) if found increase count. using hashmpap gurantess unique
# pairs



class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        d=dict()
        count=0    
        for i in nums:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        if k==0:       
            for i in  d:                
                if  d[i]>=2:
                    count+=1
        else:
            for i in d:
                if k+i in d:
                    count+=1
        return count


        
