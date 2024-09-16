#LC 532 - K-diff Pairs in an Array
#Time complexity - O(nlogn)
#Space Complexity - O(1)
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if not nums:
            return 0
        nums = sorted(nums)
        i,j = 0,1
        ans = 0
        while j < len(nums) and i < len(nums):
            if abs(nums[j] - nums[i]) == k and i != j:
                #print(j,i)
                ans = ans + 1 
                while i < len(nums)-1 and nums[i] == nums[i+1]:
                    i = i + 1
                while j < len(nums)-1 and nums[j] == nums[j+1]:
                    j = j + 1
                j = j + 1
                i = i + 1
            elif abs(nums[j] - nums[i]) > k:
                i = i + 1
            else:
                j = j + 1
        return(ans)
            