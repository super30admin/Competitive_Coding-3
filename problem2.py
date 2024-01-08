#time comlexity: O(n log n)
#space complexity:O(1)
#submit on leetcode:yes

class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:
        if k < 0:
            return 0

        count = 0
        nums.sort()

        i, j = 0, 1

        while j < len(nums):
            diff = nums[j] - nums[i]

            if diff == k:
                count += 1
                i += 1
                j += 1
                while j < len(nums) and nums[j] == nums[j - 1]:
                    j += 1
            elif diff < k:
                j += 1
            else:
                i += 1
                if i == j:
                    j += 1

        return count

sol = Solution()
nums = [3,1,4,1,5]
k = 2

print(sol.findPairs(nums,k))



