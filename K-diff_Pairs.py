# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        if len(nums) == 1:
            return 0 
        
        map = {}
        count  = 0

        for i in range(len(nums)):
            if nums[i] in map:
                map[nums[i]] += 1
            else:
                map[nums[i]] = 1
            
        
        for i in map:
            if k > 0 and i + k in map:
                count += 1
            elif k == 0 and map[i] > 1:
                count += 1


        return count