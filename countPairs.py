class Solution(object):
    def countPairs(self, nums, k):
        lookup = {}
        for num in nums:
            if num in lookup:
                lookup[num] += 1
            else:
                lookup[num] = 1
        result = 0
        
        setNums = list(set(nums))
        for i in range(len(setNums)):
            if k == 0:
                if lookup[setNums[i]] > 1:
                    lookup[setNums[i]] = 0
                    result += 1
            else:
                if setNums[i] - k in lookup and lookup[setNums[i - k]] > 0:
                    lookup[setNums[i - k]] = 0
                    result += 1
        return result

obj = Solution()
nums = [1, 2, 3, 4, 5, 3]
k = 1
print(obj.countPairs(nums, k))
nums = [1, 3, 1, 5, 4, 8]
k = 0
print(obj.countPairs(nums, k))