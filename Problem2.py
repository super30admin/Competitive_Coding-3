# Time Complexity : O(length of nums)
# Space Complexity :O(length of nums)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this : FInding optimal approach


import collections
class Solution(object):
    def findPairs(self, nums, k):
        res = 0
        c = collections.Counter(nums)
        for i in c:
            if k > 0 and i + k in c or k == 0 and c[i] > 1:
                res += 1
        return res