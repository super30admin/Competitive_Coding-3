# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Using HashMap and HashSet for this approach. HashMap to store frquencies of elements
# HashSet to check for unique pairs, then iterate over the HashMap to check if the element + k exists in HashMap and k > 0
# If a pair exists add it to HashSet
# If k == 0 and frequency of element > 1 then the element exists more than once and a pair can be formed


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if len(nums) == 0:
            return 0
        dict = {}
        res = set()
        for i in range(len(nums)):
            if nums[i] not in dict:
                dict[nums[i]] = 1
            else:
                dict[nums[i]] += 1

        for i in dict:
            num = i + k
            if num in dict and k > 0:
                if i < num:
                    res.add((i, num))
                else:
                    res.add((num, i))
            elif k == 0 and dict[num] > 1:
                res.add((i, num))
        return len(res)