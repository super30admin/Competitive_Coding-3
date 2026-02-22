# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Create a map to store frequencies of each element.
# If k == 0, then we need to find number of elements which have more than one occurence.
# If k != 0, then we need to find k + num exists in map or not.

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        freq_map = Counter(nums)
        count = 0

        for key in freq_map:
            if k == 0:
                if freq_map[key] > 1:
                    count += 1
            elif key + k in freq_map:
                count += 1

        return count