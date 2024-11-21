# // Explain your approach in three sentences only at top of your code
# // Approach: If k == 0, count the numbers with frequency greater than 1 as we need pairs of identical elements. 
# // If k > 0, use a set to store unique numbers and check for the presence of num + k for each num in the array.
# // Finally, return the total count of unique pairs found that satisfy the given condition.

# // Time Complexity : O(n), where n is the length of nums
# // Space Complexity : O(n), for the set or dictionary to store unique elements or frequencies
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : None


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # If k is negative, there are no valid pairs
        if k < 0:
            return 0
        
        if k == 0:
            # Case where k = 0: We are looking for duplicate elements in nums
            # Use a Counter to count the frequency of each number
            freq = Counter(nums)
            # Count numbers that appear more than once
            return sum(1 for count in freq.values() if count > 1)
        
        # General case where k > 0
        # Use a set to store unique numbers from the array
        unique_nums = set(nums)
        count = 0
        # For each number in the set, check if num + k exists in the set
        for num in unique_nums:
            if num + k in unique_nums:
                count += 1
        
        return count
