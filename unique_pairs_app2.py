#Time Complexity: O(NLOGN).
#Auxiliary Space: O(1)
#Did this code successfully run on Leetcode :Yes
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        nums.sort()
        result = 0
        l=0
        r=1
        while(l<len(nums)and r<len(nums)):
            if l==r or nums[r]-nums[l]<k:
                r+=1
            elif nums[r]-nums[l]>k:
                l+=1
            else:
                l+=1
                result+=1
                while(l<len(nums) and nums[l]==nums[l-1]):
                    l+=1
        return result
        