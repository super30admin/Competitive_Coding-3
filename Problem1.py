# 532. K-diff Pairs in an Array

# Time Complexity: O(n)
# Space Complexity: O(n)

# Approach:
# Use a hashmap to store the frequency of each element.
# Iterate through the array and for each element, check if the difference between the current element and the target is in the hashmap.
# If it is, increment the count.
# Return the count.

from collections import Counter

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        counts = Counter(nums)
        score = 0
        for num in counts:
            if k > 0 and num+k in counts:
                score+=1
            elif k == 0 and counts[num] > 1:
                score += 1

        return score