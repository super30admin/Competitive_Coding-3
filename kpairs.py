# Time Complexity : O(n) for n elements
# Space Complexity : O(n) for n key value pairs in dictionary
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : yes i forgot about getting the keys from the dictionary


class Solution:
    def kpairs(self, nums, k):

        if len(nums) == 0:
            return 0
        count = 0
        mydict = {}
        for i in range(len(nums)):
            if nums[i] in mydict:
                mydict[nums[i]] += 1
            else:
                mydict[nums[i]] = 1
        
        keys = mydict.keys()
        for i in keys:
            if k == 0 and mydict[i] > 1:
                count += 1
            if k > 0 and (k+i) in mydict:
                count += 1
        
        return count