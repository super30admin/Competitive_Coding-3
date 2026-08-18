# https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

# Time complexity: O(n) 
# Space complexity: O(n)
# Explanation: To avoid sorting we can use a hash map to keep a count of the frequencies of each number in nums, and then we have two cases
# - if k > 0, then we need sum of current number and k to be present in hash map to get diff to k
# - if k = 0, then we need more than 2 instances of a number to get diff to 0

from collections import Counter

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        counter = Counter(nums)
        res = 0
        for n in counter:
            if k > 0 and n + k in counter:
                res += 1
            elif k == 0 and counter[n] > 1:
                res += 1
        return res
