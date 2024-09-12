class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        dict={}
        for i in range(len(nums)):
            dict[nums[i]] = i
        count = 0 
        for i in range(len(nums)):
            target = nums[i] - k
            if target in dict:
                if (dict[target]!=i and dict[target]!=-1):
                    count+=1
                    dict[target]=-1
        return count