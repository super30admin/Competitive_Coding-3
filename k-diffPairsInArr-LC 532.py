# Time Complexity = O(n)
# Space Complexity = O(1)

class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:
        if len(nums) == 0:
            return 0
        
        n = len(nums)
        l = 0
        r = 1
        count = 0
        nums = sorted(nums)
        
        while(r < n and l < n):
                
            
            if (nums[r] - nums[l] < k or l == r):
                r += 1
            
            elif (nums[r] - nums[l] > k):
                l += 1
            
            else:
                count += 1
                r += 1
                l += 1
                while(r < n and nums[r] == nums[r - 1]):
                    r += 1
                    
        return count