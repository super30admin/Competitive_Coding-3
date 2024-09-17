'''
TC:O(NLogN)
SC:O(N)
'''

class Solution:
    def findPairs(self, nums, k) -> int:
        nums = sorted(nums)

        left = 0
        right = 1

        result = 0

        while (left < len(nums) and right < len(nums)):
            if (left == right or nums[right] - nums[left] < k):
                right += 1
            elif nums[right] - nums[left] > k:
                left += 1
            else:
                left += 1
                result += 1
                while (left < len(nums) and nums[left] == nums[left - 1]):
                    left += 1

        return result

print(Solution().findPairs([-1,-2,-3],1))