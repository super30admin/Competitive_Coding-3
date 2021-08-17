"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
from collections import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        result = 0
        # Count frequency of the elements
        freq = Counter(nums)
        # If i find the num in the hashmap then I increment my counter
        for num in freq:
            if k > 0 and num + k in freq:
                result += 1
            elif k == 0 and freq[num] > 1:
                result += 1
        return result 