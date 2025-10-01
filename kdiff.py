#Time Complexity: O(N)
#Space Complexity: O(N)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:

        res = 0
        map = {}

        for i in range(len(nums)):
                map[nums[i]] = map.get(nums[i],0) +1

        for key in map:
            if k ==0:
                if map[key] >=2:
                    res+=1
            else:
                if (key + k) in map:
                    res+=1 
        return res
        
