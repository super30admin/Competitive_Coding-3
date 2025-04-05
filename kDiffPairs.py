# Use a hashmap to count frequencies, then check for valid k-diff pairs
# TC: O(n), SC: O(n) where n = len(nums)

from typing import List


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0  # Difference can't be negative

        hash_map = {}
        count = 0

        # Create frequency map
        for num in nums:
            hash_map[num] = hash_map.get(num, 0) + 1

        # Check pairs based on k
        for num in hash_map:
            if k == 0:
                # Count elements with frequency >= 2
                if hash_map[num] > 1:
                    count += 1
            else:
                # Check if num + k exists
                if num + k in hash_map:
                    count += 1

        return count


sol = Solution()
nums1 = [3, 1, 2, 5, 6]
print(sol.findPairs(nums1, 1))
