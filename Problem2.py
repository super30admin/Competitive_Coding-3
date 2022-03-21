#    Time Complexity : O(n)
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count = Counter(nums)
        if k > 0:
            res = sum([i + k in count for i in count])
        else:
            res = sum([count[i] > 1 for i in count])
        return res
        