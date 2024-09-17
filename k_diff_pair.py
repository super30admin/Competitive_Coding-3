class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        :time complexity: O(nlogn+n)
        :space complexity: O(1)
        """
        s=0
        f=1
        count=0
        nums.sort()
        n=len(nums)
        while f< n and s<n:
            #case1: if 2 consecutive nums are equal
            if f<n-1 and nums[f]==nums[f+1]:
                f+=1
            #case2:     
            elif (nums[f]-nums[s])==k:
                count+=1
                s+=1
                f+=1
             #case3   
            elif (nums[f]-nums[s])<k:
                f+=1
            #case4
            elif (s==f) or (nums[f]-nums[s])>k:
                s+=1
                
            # handle the case [1,1,3,4,5]   
            f=max(f, s+1)
            
        return count
            