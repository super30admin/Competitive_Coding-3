#TC: O(n log(n)), n: length of nums
#SC: O(1)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        slow = 0
        fast = 1
        count = 0
        nums.sort()
        while slow < len(nums) and fast < len(nums):
            diff = nums[fast] - nums[slow]
            if diff == k:
                count+=1
                slow += 1
                fast += 1
                while fast < len(nums) and nums[fast]==nums[fast-1]:
                    fast += 1
            elif diff > k:
                slow+=1
            else:
                fast+=1
            if slow == fast:
                fast += 1

        return count


