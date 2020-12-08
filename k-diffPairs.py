# Time Complexity - O(nlog(n))

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding this : No

# Approach
# I first sort the list and use two pointer approach. I compute the diff and if diff < k do j += 1 and if diff  < k do i +=1
# to avoid the repeated pairs I skip the elements where the previous the previous element is same.

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if nums == None or len(nums) == 0:
            return None

        nums.sort()

        i, j, count = 0, 1, 0

        while (i < len(nums) and j < len(nums)):

            diff = abs(nums[i] - nums[j])

            if i != j and diff == k:
                count += 1
                j += 1
                i += 1
                while (i < len(nums) and nums[i] == nums[i - 1]):
                    i += 1
                while (j < len(nums) and nums[j] == nums[j - 1]):
                    j += 1

            elif diff < k:
                j += 1

            else:
                i += 1

        return count
