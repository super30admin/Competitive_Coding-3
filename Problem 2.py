# time complexity = O(nlogn)
# space complexity = O(1)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        n = len(nums)
        slow = 0
        fast = 1
        counter = 0
        nums = sorted(nums)
        while slow < n and fast < n:
            diff = nums[fast] - nums[slow]
            if diff < k or slow == fast:

                fast += 1
            elif diff > k:
                slow += 1
            else:
                while fast < n - 1 and nums[fast] == nums[fast + 1]:
                    fast += 1
                print(slow)
                print(fast)
                counter += 1
                slow += 1
                fast += 1

        return counter
