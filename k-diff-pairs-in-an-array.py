# Time Complexity : O(n) - n is len(nums)
# Space Complexity : O(5n) = O(n) + O(4n) - O(n) for storing at the max n elements in setElements and
#                                           O(4n) for storing at the max 4 pairs for each element
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
Store the seen element in setElements set
If there is a y in setElements where abs(nums[i] - y) == k and that pair not in setPairs,
add the pair in the setPairs in both the orders nd increment count by 1
"""

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        setPairs = set()
        setElements = set()
        n = len(nums)
        count = 0

        for i in range(0,n):
            if nums[i] - k in setElements:
                if str(nums[i]) + "," + str(nums[i]-k) not in setPairs:
                    setPairs.add(str(nums[i]) + "," + str(nums[i]-k))
                    setPairs.add(str(nums[i]-k) + "," + str(nums[i]))
                    count += 1
            if nums[i] + k in setElements:
                if str(nums[i]) + "," + str(nums[i]+k) not in setPairs:
                    setPairs.add(str(nums[i]) + "," + str(nums[i]+k))
                    setPairs.add(str(nums[i]+k) + "," + str(nums[i]))
                    count += 1
            setElements.add(nums[i])
        return count