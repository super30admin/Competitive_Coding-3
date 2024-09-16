from collections import Counter
class Solution:
    """
    Hash map approach
    TC - O(n)
    SC - O(n)
    """

    def approach1(self, nums, k):
        ans = 0
        hp = Counter(nums)
        if k == 0:
            for i in hp.values():
                if i > 1:
                    ans += 1
        else:
            for i in hp.keys():
                if i + k in hp:
                    ans += 1
        return ans

    """
    Two pointer approach
    TC - O(nlogn)
    SC - O(n)
    """

    def approach2(self, nums, k):
        ans = 0
        if k == 0:
            for i in Counter(nums).values():
                if i > 1:
                    ans += 1
        else:
            nums = sorted(nums)
            left, right = 0, 1
            while right < len(nums):
                diff = abs(nums[right] - nums[left])
                if diff == k:
                    ans += 1
                    right += 1
                    while right < len(nums) and nums[right] == nums[right - 1]:
                        right += 1
                elif diff > k:
                    left += 1
                    while left < len(nums) and nums[left] == nums[left - 1]:
                        left += 1
                else:
                    right += 1
        return ans

    def findPairs(self, nums: List[int], k: int) -> int:
        if nums is None or not nums:
            return 0
        return self.approach2(nums, k)