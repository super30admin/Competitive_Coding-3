#time: O(n)
#space: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hmap= dict()
        dup=set()
        for i in range(len(nums)):
            if nums[i] in hmap:
                dup.add(nums[i])
            hmap[nums[i]]=i
        hset=set()
        if k==0:
            return len(dup)
        else:
            for j in hmap:
                if (j+k) in hmap:
                    hset.add((j,j+k))
        return len(hset)


        
