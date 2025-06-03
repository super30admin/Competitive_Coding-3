class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        pairs=set()
        hset=set()
        n=len(nums)
        for i in range(n):
            if nums[i]-k in hset:
                pair=tuple(sorted([nums[i]-k, nums[i]]))
                pairs.add(pair)
            
            if nums[i]+k in hset:
                pair=tuple(sorted([nums[i]+k, nums[i]]))
                pairs.add(pair)
            
            hset.add(nums[i])
        
        return len(pairs)
            
