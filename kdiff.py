# K-diff Pairs in an Array
# https://leetcode.com/problems/k-diff-pairs-in-an-array/
# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0  # absolute difference can't be negative
        freq = {}
        for n in nums:
            freq[n] = freq.get(n,0) + 1
        count = 0
        for num in freq:
            if k == 0:
                # Special case: need at least 2 occurrences of num
                if freq[num] >= 2:
                    count += 1
            else:
                # If num + k exists, we have a valid pair
                if num + k in freq:
                    count += 1
        return count
