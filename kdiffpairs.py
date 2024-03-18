#T.C. O(n) # as we are iterating through hashmap
#S.C. O(n) #declaring hashmap
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hmap = {}
        count = 0
        for i in range(len(nums)):
            if nums[i] in hmap:
                hmap[nums[i]] += 1
            else:
                hmap[nums[i]] = 1
    
    
        for key in hmap.keys():
            if (key - k) in hmap and k > 0:
                count+=1
            elif k == 0:
                if hmap[key] > 1:
                    count += 1
        return count
