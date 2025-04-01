# Time complexity: O(nlogn) + O(n) where n = length of input array
# Space complexity: O(1)
# Did this code run successfully on Leetcode: Yes

from typing import List
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        i, j = 0, 1
        res = 0
        while j < len(nums):
            diff = abs(nums[i] - nums[j])
            if diff == k:
                res += 1
                j += 1
                while j < len(nums) and nums[j] == nums[j-1]:
                    j += 1
            elif diff < k:
                j += 1
            elif diff > k:
                i += 1
                if i == j:
                    j += 1
        return res