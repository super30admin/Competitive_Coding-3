# Time : O(nlogn)
# Space: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        n = len(nums)
        result = set()
        fast = 1
        slow = 0
        nums.sort() 
        counts = {}
        for num in nums:
            if num in counts:
                counts[num] += 1
            else:
                counts[num] = 1
        while fast < n: 
            if fast > slow:
                if abs(nums[slow] - nums[fast]) == k:
                    result.add((nums[slow], nums[fast])) 
                    slow += counts[nums[slow]]
                elif abs(nums[slow] - nums[fast]) > k:
                    slow += counts[nums[slow]]
                    fast -= 1  
            fast += 1
        
        return len(result)

