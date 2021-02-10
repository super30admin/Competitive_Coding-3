#TimeComplexity:O(N) 
#SpaceComplexity: Extra space for Hashmap O(n)
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        len1=len(nums)
        if k==0:
            count=0
            dict={}
            for i in range(len(nums)):
                if nums[i] in dict:
                    dict[nums[i]]+=1
                else :
                    dict[nums[i]]=1
            for i in dict.values():
                if i >=2:
                    count+=1
            return count

        nums=set(nums)

        count=0

        nums1=list(nums)
        for i in range(len(nums1)):
            if nums1[i]+k in nums:
                count+=1
            else:
                pass
        return count
