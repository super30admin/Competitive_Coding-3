#Time Complexity: O(n)
#Space Complexity: O(1)
from collections import Counter
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        dict_nums = Counter(nums)
        count = 0

        if k == 0:
            for val in dict_nums.values():
                if val > 1:
                    count += 1
        else:
            for num in dict_nums:
                if num + k in dict_nums:
                    count += 1
        return count
        