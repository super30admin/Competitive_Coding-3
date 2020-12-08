class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        #O(NlogN)
        #O(1)
        #sorted array operations
        #slow fast pointers, move your fast pointer further right if not yet found element within range
        s=0
        f=0
        n=len(nums)
        nums.sort()
        count=0
        #while inside bounds
        while s<n and f<n:
            #move further right if not within range
            if s==f or nums[f]-nums[s]<k:
                f+=1
            #move slow ahead if out of range
            elif nums[f]-nums[s]>k:
                s+=1
            #found pair, move both pointers ahead and to avoid repetitions skip same fast pointers
            else:
                s+=1
                f+=1
                count+=1
                while f<n and nums[f]==nums[f-1]:
                    f+=1
            
        return count
                
            