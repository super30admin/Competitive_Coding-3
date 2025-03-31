# Approach:
# Sort the array and use two pointers (l and r).
# If the diff is k, it's a valid pair and we count it while skipping duplicates.
# If the diff is less, move right; if more, move left.

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        count = 0
        l, r = 0, 1

        while r < len(nums):
            if l == r:
                r += 1
                continue

            cur = nums[r] - nums[l]

            if cur == k:
                count += 1
                r += 1
                # Skip duplicates
                while r < len(nums) and nums[r] == nums[r - 1]:
                    r += 1

            elif cur > k:
                l += 1
            else:
                r += 1

        return count

# Time Complexity: O(n log n)
# Space Complexity: O(1)
