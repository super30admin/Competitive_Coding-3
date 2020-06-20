# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
from collections import Counter
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        #if k < 0 return 0
        if k <0:
            return 0
        #count how many of each number there is
        count = Counter(nums)
        sol = 0
        #loop through keys
        for key in count.keys():
            #if diff is 0
            if k ==0:
                # only increment sol if count[key] > 1
                if key in count and count[key]>1:
                    sol+=1
            #else if you find the complement of the key in count add one
            elif (key-k) in count:
                sol+=1
        #return solution
        return sol