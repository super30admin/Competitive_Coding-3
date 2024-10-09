# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Problem Name: K-diff Pairs in an Array

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if k < 0:
            return 0
        smap = {}
        count = 0

        for num in nums:
            if num in smap:
                smap[num] += 1
            else:
                smap[num] = 1
        if k == 0:
            for num in smap:
                if smap[num] > 1:
                    count += 1
        else:
            for num in smap:
                if (num + k ) in smap:
                    count += 1
        
        return count
        