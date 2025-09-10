# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# The intuition is about 2 cases, one if k == 0 then determine if there is a freq of more than 1 for an element and then
# if k > 0 then num + k should be present in the counter map.

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        counter = Counter(nums)
        result = 0
        if k == 0:
            for num, freq in counter.items():
                if freq > 1:
                    result += 1
        else:
            for num in counter:
                if num + k in counter:
                    result += 1

        return result