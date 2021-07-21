class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if nums == [] or len(nums) == 0:
            return 0
        
        pairs = {}
        pair = 0
        
        for i in range(0, len(nums)):
            if nums[i] in pairs:
                pairs[nums[i]] += 1
            else:
                pairs[nums[i]] = 1
        
        #used dictonary for the k == 0 conditions
        if k == 0:
            for i in pairs:
                if pairs[i] > 1:
                    pair += 1
            return pair
        
        # creating the set to get the unique values
        s = set(nums)
        for i in s:
            temp = i+k
            if temp in s:
                pair += 1
            
        return pair
