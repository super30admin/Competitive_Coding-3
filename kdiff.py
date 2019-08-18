"""
Time: O(n)
Space: O(n)
Leet: Accept
Problems: None
"""

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        dict1 = {}
        result = set()
        if k<0:
            return 0

        for i in range(len(nums)):
            if nums[i] in dict1:
                dict1[nums[i]] += 1
            else:
                dict1[nums[i]] = 1

        for key in dict1:
            if k==0:
                if dict1[key] > 1:
                    result.add((key,key))
            else:
                if key+k in dict1:
                    if key+k > key:
                        result.add((key,key+k))
                    else:
                        result.add((key+k,key))

        return len(result)
