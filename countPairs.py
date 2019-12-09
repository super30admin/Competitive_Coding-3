class Solution(object):
    def countPairs(self, nums, k):
        lookup = {}
        for num in nums:
            if num in lookup:
                lookup[num] += 1
            else:
                lookup[num] = 1
        result = 0

        # setNums = list(set(nums))
        for i in range(len(nums)):
            
            if k == 0:
                if lookup[nums[i]] > 1:
                    lookup[nums[i]] = 0
                    result += 1
            else:
                if nums[i] - k in lookup and lookup[nums[i] - k] > 0:
                    lookup[nums[i] - k] = 0
                    result += 1
            print(nums[i], lookup, result)
        return result

obj = Solution()
nums = [1, 2, 3, 4, 5]
k = -1
print(obj.countPairs(nums, k))
nums = [1, 3, 1, 5, 4, 8]
k = 0
# print(obj.countPairs(nums, k))