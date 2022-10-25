# Time Complexity: O(n*log(n))
# Space Complexity: O(1)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        start = 0
        end = start + 1
        result = 0
        while start < len(nums) and end < len(nums):
            if start == end or nums[end]-nums[start] < k:
                end += 1
            elif nums[end] - nums[start] > k:
                start += 1
            else:
                result += 1
                start += 1
                print(start)
                while start < len(nums) and nums[start] == nums[start-1]:
                    start += 1
        return result
        