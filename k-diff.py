# The code defines a findPairs method to count the number of unique k-diff pairs in a list of integers.
# A k-diff pair is defined as two numbers in the list where the absolute difference between them is equal to k.

# Initial Setup:
#   - Use the Counter class to count the frequency of each number in nums and store it in 'count'.
#       - This provides an efficient way to check for the existence of elements and their frequencies.

# Case 1: k > 0
#   - For a positive difference k, iterate over each unique number in 'count'.
#   - Check if the current number + k exists in the Counter.
#       - This means there exists a pair (i, i + k) with the desired difference.
#   - Sum up the results of these checks (True counts as 1) to get the total number of such pairs.

# Case 2: k == 0
#   - For a zero difference, a valid pair exists only if the frequency of a number in the list is greater than 1.
#   - Iterate over each number in 'count' and check if its frequency is greater than 1.
#   - Sum up the results of these checks to get the count of such pairs.

# Final Result:
#   - The method returns the total number of unique k-diff pairs found in the list.

# TC: O(n) - The time complexity is linear as the Counter is constructed in O(n), and each unique number in the Counter is processed once.
# SC: O(n) - The space complexity is linear due to the storage of the Counter, which stores the frequency of each unique number.


from typing import Counter, List


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = Counter(nums)
        if k > 0:
            return sum([i + k in count for i in count])
        else:
            return sum([count[i] > 1 for i in count])