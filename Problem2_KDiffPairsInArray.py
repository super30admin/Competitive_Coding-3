# Time Complexity: O(n logn), where n is length of nums
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if not nums or len(nums) == 0:
            return 0

        n = len(nums)
        nums.sort()
        count = 0
        slow = fast = 0

        while fast < n:
            diff = nums[fast] - nums[slow]

            # case 1
            if slow == fast or diff < k:
                fast += 1

            # case 2
            elif diff > k:
                slow += 1

            # case 3
            else:
                count += 1
                slow += 1
                fast += 1

                # check for uniqueness
                while fast < n and nums[fast] == nums[fast - 1]:
                    fast += 1

        return count



