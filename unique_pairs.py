#Time Complexity: O(N).
#Auxiliary Space: O(N)
#Did this code successfully run on Leetcode :Yes

from collections import Counter
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count_dict = Counter(nums)
        result = 0
        for key,v in count_dict.items():
            if k==0 and count_dict[key]>1:
                result+=1
            elif k>0 and key+k in count_dict:
                result+=1
        return result