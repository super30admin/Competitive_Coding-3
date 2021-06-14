class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = 0
        slow = 0
        fast = 0
        nums = sorted(nums)
        while fast < len(nums):
            if fast == slow:
                fast += 1
            elif nums[fast] - nums[slow] == k:
                count +=1
                fast +=1
                slow +=1
                while (fast < len(nums) and nums[fast] == nums[fast-1]):
                    fast +=1
            elif nums[fast] - nums[slow] > k:
                slow +=1
            else:
                fast +=1
        return count

# Time complexity is O(nlogn) since we are sorting the array
# Space complexity is O(1)