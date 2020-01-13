from typing import List
from collections import Counter


class Solution:

    def findPairs(self, nums: List[int], k: int) -> int:

        if not nums or k < 0:
            return 0

        # store count of each number
        dic = Counter(nums)
        result = 0
        # traverse all the keys
        for key in dic.keys():
            if (k > 0 and key - k in dic) or (k == 0 and dic[key] > 1):
                result += 1
        return result

    def find_pairs_two_pointers(self, nums: List[int], k: int) -> int:
        """
          // Time Complexity :
                            O(nlogn) Sorting
          // Space Complexity : O(n)
          // Did this code successfully run on Leetcode : Yes
        """
        if not nums or k < 0:
            return 0

        result = []
        nums.sort()

        length = len(nums) - 1
        low = 0
        high = 1

        while low <= length and high <= length:
            # case 1
            # difference is greater than k
            if nums[high] - nums[low] > k:
                low += 1
            # case 2
            # difference is lesser than k
            elif low == high or nums[high] - nums[low] < k:
                high += 1
            # case 3
            # difference is equal to k
            # we cannot move the high pointer because we might
            # have a unique pair from that number but we cannot
            # have a unique pair from the low pointer
            else:
                result.append((nums[low], nums[high]))
                low += 1
                # skip duplicates
                while low <= length and nums[low] == nums[low - 1]:
                    low += 1
                # low might have move ahead of high
                # change high pointer position
                high = max(low, high)
        return len(result)


if __name__ == '__main__':
    h = Solution()
    print(h.find_pairs_two_pointers([3, 1, 4, 1, 5], 2))
    print(h.find_pairs_two_pointers([1, 2, 3, 4, 5], 1))
    print(h.find_pairs_two_pointers([1, 3, 1, 5, 4], 0))
    print(h.findPairs([3, 1, 4, 1, 5], 2))
    print(h.findPairs([1, 2, 3, 4, 5], 1))
    print(h.findPairs([1, 3, 1, 5, 4], 0))
