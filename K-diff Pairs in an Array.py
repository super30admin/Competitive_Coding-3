# Arrays + Hashmap
# TC: O(N)
# SC: O(N)

class Solution:
    def findPairs(self, nums,k):
        
        hmap = {}
        ans = 0
        
        for i in range(len(nums)):
            if nums[i] in hmap:
                hmap[nums[i]] += 1
            else:
                hmap[nums[i]] = 1
                
        print(hmap)
        
        for val,c in hmap.items():
            if k>0 and val+k in hmap:
                ans += 1
            elif k==0 and hmap[val]>1:
                ans += 1
            
        return ans
            