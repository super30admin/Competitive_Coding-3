# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if len(nums) == 0 or nums == None:
            return 0
        count = 0
        res = {}
        for i in nums:
            if i not in res:
                res[i] = 1
            else:
                res[i] += 1

        for num in res:
            if k > 0:
                if num - k in res:
                    count += 1
            elif k == 0:
                if res[num] >= 2:
                    count += 1
        return count