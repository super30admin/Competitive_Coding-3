class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:

        seen = set()
        result = set()

        for i in range(0, len(nums)):
            big = nums[i] + k
            small = nums[i] - k

            if big in seen:
                res = tuple(sorted([nums[i], big]))
                result.add(res)

            if small in seen:
                res1 = tuple(sorted([nums[i], small]))
                result.add(res1)

            seen.add(nums[i])

        return len(result)
        
# Time complexity: O(n)
# Space complexity: O(n)
