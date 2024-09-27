from typing import List
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if nums == None or len(nums) == 0:
            return 0
        map = {}
        mySet = set()
        for i in range(len(nums)):
            map[nums[i]] = 0
        for i in range(len(nums)):
            map[nums[i]] += 1
        for i in range(len(nums)):
            find = nums[i] - k 
            if (find == nums[i] and map[nums[i]] > 1) or (find!= nums[i] and find in map.keys()):
                li = [nums[i], find]
                li.sort()
                mySet.add(tuple(li))
        return len(mySet)

obj = Solution()
print(obj.findPairs([3,1,4,1,5], 2))
print(obj.findPairs([1,2,3,4,5], 1))
print(obj.findPairs([1,3,1,5,4],0))
print(obj.findPairs([1,2,4,4,3,3,0,9,2,3],3))
print(obj.findPairs([-1,-2,-3],1))

# Time Complexity : O(n)
# Space Complexity : O(n) for hashmap
                