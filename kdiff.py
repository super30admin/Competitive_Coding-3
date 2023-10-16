#Time complexity : O(n^2)
#Space Complexity : O(1)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        if (k==0 and sorted(nums) != list(set(nums))):
            return 1
        nums = list(set(nums))
        count = 0
        i=0
        while(i<len(nums) - 1):
            j = i + 1
            while(j<len(nums)):
                if abs(nums[i] - nums[j]) == k :
                    count = count + 1
                    j = j+1
                else:
                    j = j+1
            i=i+1
        return count
