#Time Complexity: O(n)
#Space complexity: O(n)

class Solution:

    def findPairs(self, nums, k):
        
        lookUp, result = set(), set()

        for i in range(len(nums)):
            if nums[i] - k in lookUp:
                result.add(nums[i] - k)

            if nums[i] + k in lookUp:
                result.add(nums[i])

            lookUp.add(nums[i])

        return len(result)