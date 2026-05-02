# https://leetcode.com/problems/k-diff-pairs-in-an-array/

class Solution:
    def findPairs(self, nums, k):
        count_map = {}
        for num in nums:
            count_map[num] = count_map.get(num, 0) + 1
        result = 0
        for x in count_map.keys():
            if k > 0 and x + k in count_map:
                result += 1
            if k == 0 and count_map[x] > 1:
                result += 1
        return result
