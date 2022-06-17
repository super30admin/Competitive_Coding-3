# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        my_set=set()
        result=set()
        for i in range(len(nums)):
            if nums[i]-k in my_set:
                result.add(tuple(sorted([nums[i],nums[i]-k])))
                # print([nums[i],nums[i]-k])
            if nums[i]+k in my_set:
                result.add(tuple(sorted([nums[i],nums[i]+k])))
                # print([nums[i],nums[i]+k])
            my_set.add(nums[i])
        return len(result)