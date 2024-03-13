# https://leetcode.com/problems/k-diff-pairs-in-an-array/

# Time Complexity : O(N) is Number of values in the given array.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach.
# Approach - We iterate over the input array and create a HashMap with frequency.
# we calculate the addition between current element and given K.
# If the target is already present in the hashset we increment our count by 1.
# if k == 0 and if the frequency of element is greater than 1 we increment the result.


from typing import List
from collections import Counter


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        result = 0

        counter = Counter(nums)

        for x in counter:
            if k > 0 and x + k in counter:
                result += 1
            elif k == 0 and counter[x] > 1:
                result += 1
        return result