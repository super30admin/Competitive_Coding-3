# Time Complexity: O(nlogn)
# Space Complexity: O(n)
class Solution(object):
    # sort the array and initiate two pointers
    def findPairs(self, nums, k):
        nums.sort()
        i = 0
        j = 1

        res = 0
        # until we reach end of the array
        while i < len(nums) and j < len(nums):
            # if current two pointers number are same and or their difference is less than k then update second pointer
            if i == j or nums[j] - nums[i] < k:
                j += 1
            # if difference is greater than k update first pointer
            elif nums[j] - nums[i] > k:
                i += 1
            # else just update the first pointer and update the result
            # and to reduce duplicate numbers considered in result
            else:
                i += 1
                res += 1

                while i < len(nums) and nums[i] == nums[i - 1]:
                    i += 1

        return res

        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
