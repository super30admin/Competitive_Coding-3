# Time Complexity : O(n)
# Space Complexity : O(n)

class Solution:
    def findPairs(nums, k):
        if len(nums) == 0 or nums is None:
            return 0

        dict = {}
        res = 0
        for i in range(len(nums)):
            if nums[i] not in dict:
                dict[nums[i]] = 1
            else:
                dict[nums[i]] += 1
        
        for i in dict:
            if k != 0:
                searchElement = i + k
                if searchElement in dict:
                    res += 1
            else:
                if dict[i] >= 2:
                    res += 1

        return res
