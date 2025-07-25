# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        res = set()
        compset = set()

        for i in range(len(nums)):
            subval = nums[i] - k
            addval = nums[i] + k

            if (subval, nums[i]) in res or (nums[i], subval) in res or (addval, nums[i]) in res or (nums[i],
                                                                                                    addval) in res:
                continue

            else:
                if subval in compset:
                    res.add((subval, nums[i]))

                if addval in compset:
                    res.add((addval, nums[i]))

                compset.add(nums[i])

        return len(res)
