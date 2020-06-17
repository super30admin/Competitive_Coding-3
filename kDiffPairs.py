class Solution(object):
    # Time Complexity : O(n*log(n)), where n is the length of nums
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : yes
    # Any problem you faced while coding this : no

    # Your code here along with comments explaining your approach

    # This approach uses a two pointers approach, where every pointer is used to
    # track unique numbers and for every pair of numbers the difference is compared
    # to the target, the result and the pointers are incremented accordingly.
    def findPairs2Pointers(self, nums, k):
        # edge case
        if not nums or k < 0:
            return 0

        nums.sort()
        retVal, n = 0, len(nums)
        i, j = 0, 1

        while j < n:
            # removing duplicity at j pointer
            while j + 1 < n and nums[j] == nums[j + 1]:
                j += 1
            # incrementing i pointer until diff > k
            while i + 1 < j and nums[j] - nums[i] > k:
                i += 1
            # checking if diff == k
            diff = nums[j] - nums[i]
            if diff == k:
                retVal += 1
                i += 1
            # always move j pointer
            j += 1

        return retVal

#------------------------------------------------------x---------------------------------------------------------------#

    # Time Complexity : O(n), where n is the length of nums
    # Space Complexity : O(n), where n is the length of nums
    # Did this code successfully run on Leetcode : yes
    # Any problem you faced while coding this : no

    # Your code here along with comments explaining your approach

    # This approach uses a hashmap to store all unique elements and the number of times they occur.
    # for every element check if (num + k) also exists and increment the result accordingly.
    # for a special case of k == 0 check whether an element occurs more than once and increment result.
    def findPairsHashMap(self, nums, k):
        # edge case
        if not nums or k < 0:
            return 0

        store, retVal = {}, 0

        for i in nums:
            try: store[i] += 1
            except: store[i] = 1

        for i in store:
            if k == 0:
                if store[i] > 1:
                    retVal += 1
            else:
                if k + i in store:
                    retVal += 1

        return retVal


print(Solution().findPairs2Pointers([1, 4, 3, 1, 5], 2))
print(Solution().findPairsHashMap([1, 4, 3, 1, 5], 2))
