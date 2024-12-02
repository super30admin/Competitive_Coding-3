# TC: O(NlogN) since we are sorting the array and then iterating over it. 
# SC: O(1) since we are not using any extra space. 


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if not nums or len(nums) == 0:
            return 
        
        i = 0
        j = 1
        count = 0
        nums.sort()
        
        while j < len(nums):
            if i == j:
                j += 1
                while j < len(nums) - 1 and nums[j] == nums[j - 1]:
                    j += 1
            
            if i > 0 and nums[i] == nums[i - 1]:
                i += 1
                continue
            
            if j < len(nums):
                diff = abs(nums[i] - nums[j])
                if diff == k:
                    count += 1
                    i += 1
                elif diff < k:
                    j += 1
                    while j < len(nums) - 1  and nums[j] == nums[j - 1]:
                        j += 1
                else:
                    i += 1
        return count
