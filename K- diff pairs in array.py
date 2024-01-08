class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = 0
        a = set()
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i] - nums[j] == k:
                    a.add((nums[i],nums[j]))
                if nums[j]-nums[i] == k:
                    a.add((nums[j], nums[i]))
        return len(a)

#Time complexity : O(N*N)
#Space complexity : O(N)
