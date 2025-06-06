Time Complexity -  O(n) 
Space Complexity - O(n)

from collections import Counter

class Solution:
    def findPairs(self, nums, k):
        count_map = Counter(nums)
        count = 0

        for key in count_map:
            if k > 0 and key + k in count_map:
                count += 1
            elif k == 0 and count_map[key] > 1:
                count += 1
        return count
