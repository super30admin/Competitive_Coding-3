# TC: O(nlogn)
# SC: O(1)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums = sorted(nums)
        p1, p2 = 0, 0
        count = 0
        n = len(nums)

        while p1 < n and p2 < n:
            diff = abs(nums[p1] - nums[p2])
            if  p1 != p2 and diff == k:
                count += 1
                p1 += 1
                p2 += 1
                if p1 > 0 and p1 < n - 1:
                    while p1 < n and nums[p1 - 1] == nums[p1]:
                        p1 += 1            
                if p2 > 0 and p2 < n - 1:
                    while p2 < n and nums[p2 - 1] == nums[p2]:
                        p2 += 1
            elif diff < k:
                p1 += 1
            else:
                p2 += 1
        return count