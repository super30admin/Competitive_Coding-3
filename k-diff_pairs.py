class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #sorting the array
        nums.sort()
        #initializing count and 2 pointers l,r
        count=0
        l=0
        r=1
        #traversing array
        while l<len(nums) and r<len(nums):
            #condition for right pointer to move
            if l==r or nums[r]-nums[l]<k:
                r+=1
            #condition for left pointer to move
            elif nums[r]-nums[l]>k:
                l+=1
            else:
                l+=1
                count+=1
                #skipping duplicates
                while l<len(nums) and nums[l]==nums[l-1]:
                    l+=1
        return count
#Time-Complexity: O(NlogN)
#Space-Complexity: O(1)