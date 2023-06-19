"""
Problem : 2

Time Complexity : O(n)
Space Complexity : O(n)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Creating a hash map for counter number of occurences of each number in input array
then checking if the difference between the target and current number exist in the map
incrementing the result by 1 if it exists and returning it

"""

# K diff pairs in an array
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        result = 0

        counter = {}

        for i in range(len(nums)):
            if nums[i] in counter:
                counter[nums[i]]+=1
            else:
                counter[nums[i]]=1

        for x in counter:
            if k > 0 and x + k in counter:
                result += 1
            elif k == 0 and counter[x] > 1:
                result += 1
        return result

            

            