# Time Complexity: O(nlogn)
# Space Complexity: O(1)
  
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        
        low = 0
        high = 1
        n = len(nums)
        res = 0
        
        while low < n and high < n:
            if (low == high) or (nums[high]-nums[low] < k):
                high += 1
            elif nums[high] - nums[low] > k:
                low += 1
            else:
                low += 1
                res += 1
                while low < n and (nums[low] == nums[low-1]):
                    low += 1
        return res
                
        
