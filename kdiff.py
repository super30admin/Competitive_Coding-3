#Time: o(nlogn) space: o(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        n=len(nums)
        if n<2:
            return 0
        l=0
        r=1
        nums=sorted(nums)
        ret=0
        while(l<n and r<n):
            c=nums[r]-nums[l]
            if (l==r or c<k):
                r+=1
            elif c>k:
                l+=1
            else:
                l+=1
                ret+=1
                while(l<n and nums[l]==nums[l-1]):
                    l+=1
        return ret 
