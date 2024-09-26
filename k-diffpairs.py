class Solution:

    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        count = 0
        pairs = {}
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                diff = abs(nums[i] - nums[j])
                if(diff == k):
                    pairs[nums[i]] = nums[j]
                        
        return len(pairs)
        
