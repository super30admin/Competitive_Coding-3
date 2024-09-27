"""532. K-diff Pairs in an Array
Time Complexity - O(n)
Space Complexity - O(1)
Sort array
Consider 2 pointers 1 fast,1 slow
while slow < len(nums) and fast < len(nums)
    if slow == fast or nums[fast] - nums[slow] < k
        fast ++
    elif nums[fast] - nums[slow] > k
        slow++
    else
        count ++
        slow++
        fast ++
        while loop to prevent duplicates
return count"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums = sorted(nums)
        slow = 0
        fast = 0
        count = 0
        while (slow < len(nums) and fast < len(nums) ):
            if slow == fast or nums[fast] - nums[slow] < k:
                fast += 1
            elif nums[fast] - nums[slow] > k:
                slow += 1
            else:
                count += 1
                slow += 1
                fast += 1
                while fast <len(nums) and nums[fast] == nums[fast-1]:
                    fast +=1
        return count