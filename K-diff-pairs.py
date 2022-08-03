# Tc: O(n^2)
# SC: O(n)
class Solution:
    def findPairs(self, nums, k):

        s_nums = sorted(nums)

        result = 0

        for i in range(len(s_nums)):
            if (i > 0 and s_nums[i] == s_nums[i - 1]):
                continue
            for j in range(i + 1, len(s_nums)):
                if (j > i + 1 and s_nums[j] == s_nums[j - 1]):
                    continue

                if abs(s_nums[j] - s_nums[i] == k):
                    result += 1

        return result
