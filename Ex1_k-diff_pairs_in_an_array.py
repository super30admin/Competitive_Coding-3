# Time Complexity : O(n), where n is the length of nums
# Space Complexity : O(n), for storing frequency map
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

from typing import List

class Solution:

    def findPairs(self, nums: List[int], k: int) -> int:

        # HashMap Approach

        freq = {}
        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        count = 0
        for num in freq:
            if k > 0 and num + k in freq:
                count += 1
            elif k == 0 and freq[num] > 1:
                count += 1

        return count



        # Two Pointers Approach (Requires Sorting)
        # Time: O(n log n), Space: O(1)

        # n = len(nums)
        # nums.sort()
        # count = 0
        # l = 0
        # r = 1

        # while l < n and r < n:
        #     if l == r or nums[r] - nums[l] < k:
        #         r += 1
        #     elif nums[r] - nums[l] > k:
        #         l += 1
        #     else:
        #         count += 1
        #         l += 1
        #         while l < n and nums[l] == nums[l-1]:
        #             l += 1

        # return count 


        # Brute Force Approach
        # Time: O(n^2), Space: O(n)
        
        # n = len(nums)
        # seen = set()

        # for i in range(n):
        #     for j in range(i + 1, n):
        #         if abs(nums[i] - nums[j]) == k:
        #             seen.add(tuple(sorted([nums[i], nums[j]])))

        # return len(seen)






if __name__ == "__main__":
    sol = Solution()
    print(sol.findPairs([3, 1, 4, 1, 5], 2))  # Output: 2
    print(sol.findPairs([1, 2, 3, 4, 5], 1))  # Output: 4
    print(sol.findPairs([1, 3, 1, 5, 4], 0))  # Output: 1