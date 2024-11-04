'''
    Time Complexity: O(nlogn + n)
    Space Complexity: O(1)
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        count = 0
        n = len(nums)
        slow, fast = 0, 1

        while slow < n and fast < n:
            diff = nums[fast] - nums[slow]

            if slow == fast or diff < k:
                fast += 1
            elif diff > k:
                slow += 1
            else:
                count += 1
                slow += 1
                fast += 1
                
                while slow < n and nums[slow] == nums[slow - 1]:
                    slow += 1
                while fast < n and fast > slow and nums[fast] == nums[fast - 1]:
                    fast += 1

        return count