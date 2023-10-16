# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        dict = {}
        pairs = 0
        for num in nums: 
            if num in dict:
                dict[num] = dict[num] + 1
            else:
                dict[num] = 1

        for num in dict:
            if ((k == 0 and dict[num] > 1) or (k > 0 and (num+k in dict))):
                pairs += 1
        
        return pairs