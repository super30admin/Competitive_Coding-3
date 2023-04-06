# Time Complexity : O(n) because we are iterating through the list once
# Space Complexity : O(n) because of the hashmap
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we get all the pairs of numbers whose difference is k by creating a Counter 
and then using the hashmap to search for a number that we would need to get to k. If k is
 0 we just count the numbers that occur more than once. 
"""

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:

        hashmap = collections.Counter(nums)

        pairs = 0

        for key, value in hashmap.items():
            number_to_search = key + k

            if k == 0:
                if value > 1:
                    pairs += 1
            elif number_to_search in hashmap:
                pairs += 1

        return pairs