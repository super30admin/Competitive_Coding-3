# Time Complexity : O(n)    
# Space Complexity : O(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        if len(nums) <= 1:
            return 0
        n = len(nums)
        p1, p2 = 0, 1
        res = 0
        while p2 < n:
            if nums[p2] - nums[p1] == k:
                res += 1
                temp = nums[p1]
                while nums[p1] == temp and p1 < n - 1:
                    p1 += 1
                p2 = p1 + 1
            elif nums[p2] - nums[p1] > k:
                p1 += 1
                if p1 == p2:
                    p2 += 1
            else:
                p2 += 1
            
        return res