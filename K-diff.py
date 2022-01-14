# This is solution for:
# TC = O(NlogN)
# SC = O(1)
# since we are creating a new row each time we append it to result
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums =sorted(nums)
        count = 0
        slow = 0
        fast = 0
        n = len(nums)

        while(slow < n and fast < n):
            # case1:
            if(slow == fast or (nums[fast] - nums[slow]) < k):
                fast += 1
            elif((nums[fast] - nums[slow]) > k):
                slow += 1
            else:
                count += 1
                slow += 1
                fast += 1
                while(fast < n and nums[fast] == nums[fast -1]):
                    fast += 1
        return count