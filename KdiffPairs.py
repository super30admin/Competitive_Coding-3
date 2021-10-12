# Time complexity: O(n) where n is the number of unique elements in the array
# Space complexity: O(n)

from collections import Counter


class Solution:
    def findPairs(self, nums, k):
        if not nums:
            return 0
        hmap = Counter(nums)
        count = 0

        for key, val in hmap.items():
            if k == 0:
                if val > 1:
                    count += 1
            elif key+k in hmap:
                count += 1
            else:
                continue

        return count


solution = Solution()
print(solution.findPairs([3, 1, 4, 1, 5], 2))
print(solution.findPairs([1, 3, 1, 5, 4], 0))
