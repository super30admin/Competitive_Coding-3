# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : NA
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = 0
        nums.sort()
        i = 0
        j = 0
        while( i < len(nums) and j<len(nums)):
            if i == j:
                j += 1
            elif nums[j]-nums[i] == k:
                count += 1
                i +=1
                j += 1
                while(j<len(nums) and nums[j-1]==nums[j]):
                    j +=1
            elif nums[j]-nums[i] > k:
                i += 1
            else:
                j += 1
        return count 


