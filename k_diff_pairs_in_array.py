# // Time Complexity :o(n)
# // Space Complexity :o(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        res = []
        myset = {}
        for i in range(0,len(nums)):
            myset[nums[i]] = i;
        for i in range(0,len(nums)):
            c1 = nums[i]-k
            c2 = nums[i]+k
            if c1 in myset and [nums[i],c1] not in res and [c1,nums[i]] not in res and i!=myset[c1]:
                res.append([nums[i],c1])
            if c2 in myset and [nums[i],c2] not in res and [c2,nums[i]] not in res and i!=myset[c2]:
                res.append([nums[i],c2])
        print(res)
        return len(res)