# We define subsequence as any subset of an array. We define a subarray as a contiguous subsequence in an array.

# Given an array, find the maximum possible sum among:

# all nonempty subarrays.
# all nonempty subsequences.
# Print the two values as space-separated integers on one line.

# Note that empty subarrays/subsequences should not be considered.

# Example

# The maximum subarray sum is comprised of elements at inidices . Their sum is . The maximum subsequence sum is comprised of elements at indices  and their sum is .

# Function Description

# Complete the maxSubarray function in the editor below.

# maxSubarray has the following parameter(s):

# int arr[n]: an array of integers
# Returns

# int[2]: the maximum subarray and subsequence sums
# Input Format

# The first line of input contains a single integer , the number of test cases.

# The first line of each test case contains a single integer .
# The second line contains  space-separated integers  where .

# Constraints

# The subarray and subsequences you consider should have at least one element.

# Sample Input 0

# 2
# 4
# 1 2 3 4
# 6
# 2 -1 2 3 4 -5
# Sample Output 0

# 10 10
# 10 11
# Explanation 0

# In the first case: The maximum sum for both types of subsequences is just the sum of all the elements since they are all positive.

# In the second case: The subarray  is the subarray with the maximum sum, and  is the subsequence with the maximum sum.

# Sample Input 1

# 1
# 5
# -2 -3 -1 -4 -6
# Sample Output 1

# -1 -1
# Explanation 1

# Since all of the numbers are negative, both the maximum subarray and maximum subsequence sums are made up of one element, .

# TC: O(n) 
    # The function has a single pass through the array.
    # All operations inside the loop are constant time.
# SC: O(n)
    # Creates a copy of the input array to store intermediate results.
# Approach : The max_subarray function solves two problems simultaneously:
            # Maximum Subarray Sum : Finds the largest sum of a contiguous sequence of elements.
            # Maximum Subsequence Sum: Finds the largest sum of elements that don't need to be contiguous.

            # The function uses dynamic programming:

            # For the subarray problem, at each position we decide whether to start a new subarray or extend the previous one.
            # For the subsequence problem, we decide whether to include the current element, add it to the existing subsequence, or keep the previous maximum.


def max_subarray(arr):
    # If array has only one element, return it as both max subarray and subsequence sum
    if len(arr) == 1:
        return [arr[0], arr[0]]
    
    # Initialize both maximum sums with the first element
    max_sum_sub_array = arr[0]  # Tracks maximum sum of contiguous subarray
    max_sum_sub_seq = arr[0]  # Tracks maximum sum of subsequence (can be non-contiguous)
    
    # Create a copy of the input array to maintain dynamic programming state
    # This avoids modifying the original array while calculating subarray sums
    dp = arr.copy()
    
    # Iterate through the array starting from the second element
    for i in range(1, len(arr)):
        # For subsequence: we either take the current element or add it to previous subsequence sum
        # We compare with existing max_sum_sub_seq to ensure we keep the maximum value found so far
        max_sum_sub_seq = max(max_sum_sub_seq, max(arr[i], arr[i] + max_sum_sub_seq))
        
        # For subarray: at each position, we either start a new subarray or extend previous one
        # This implements Kadane's algorithm for maximum subarray sum
        dp[i] = max(arr[i], arr[i] + dp[i-1])
        
        # Update the maximum subarray sum if we found a better value
        if dp[i] > max_sum_sub_array:
            max_sum_sub_array = dp[i]
    
    # Return both maximum sums as an array
    return [max_sum_sub_array, max_sum_sub_seq]