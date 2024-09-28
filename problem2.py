##Time Complexity : O(n)
##Space Complexity :O(n)
##Did this code successfully run on Leetcode : Yes
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        con = Counter(nums)
        count = 0
        if k == 0:
            for key, v in con.items():
                if v>1:
                    count+=1
        else:
            for key, v in con.items():
                if key+k in con:
                    count +=1
        return count
                