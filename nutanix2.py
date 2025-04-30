# Hackerland is a one-dimensional city with houses aligned at integral locations along a road. The Mayor wants to install radio transmitters on the roofs of the city's houses. Each transmitter has a fixed range meaning it can transmit a signal to all houses within that number of units distance away.

# Given a map of Hackerland and the transmission range, determine the minimum number of transmitters so that every house is within range of at least one transmitter. Each transmitter must be installed on top of an existing house.

# Example



#  antennae at houses  and  and  provide complete coverage. There is no house at location  to cover both  and . Ranges of coverage, are , , and .

# Function Description

# Complete the hackerlandRadioTransmitters function in the editor below.

# hackerlandRadioTransmitters has the following parameter(s):

# int x[n]: the locations of houses
# int k: the effective range of a transmitter
# Returns

# int: the minimum number of transmitters to install
# Input Format

# The first line contains two space-separated integers  and , the number of houses in Hackerland and the range of each transmitter.
# The second line contains  space-separated integers describing the respective locations of each house .

# Constraints

# There may be more than one house at the same location.
# Subtasks

#  for  of the maximum score.
# Output Format

# Print a single integer denoting the minimum number of transmitters needed to cover all of the houses.

# Sample Input 0

# STDIN       Function
# -----       --------
# 5 1         x[] size n = 5, k = 1
# 1 2 3 4 5   x = [1, 2, 3, 4, 5]  
# Sample Output 0

# 2
# Explanation 0

# The diagram below depicts our map of Hackerland:

# k-nearest(2).png

# We can cover the entire city by installing  transmitters on houses at locations  and .

# Sample Input 1

# 8 2
# 7 2 4 6 5 9 12 11 
# Sample Output 1

# 3
# Explanation 1

# The diagram below depicts our map of Hackerland:

# k-nearest2(2).png

# We can cover the entire city by installing  transmitters on houses at locations , , and .

# Submissions: 266
# Max Score: 75
# Difficulty: Medium
# Rate This Challenge:


# TC : O(n log n)
    # Sorting the array takes O(n log n) time.
    # The while loops iterate through the array at most once, which is O(n).
    # The sorting dominates, making the overall complexity O(n log n).

# SC : O(1)
    # The algorithm uses only a constant amount of extra space regardless of input size.
    # Note: If we consider the sorting implementation, Python's sort may use O(n) space internally.

# Approach :
    # This function solves the problem of placing the minimum number of transmitters to cover all houses, where each transmitter has a range of k.
    # The greedy algorithm:
        # Sort all house positions.
        # Iterate through houses:
            # For each uncovered house, place a transmitter at the rightmost possible position within k range.
            # Skip all houses covered by this transmitter.
            # Repeat until all houses are covered.

    # This is optimal because by always placing transmitters at the rightmost possible position, we maximize the coverage of each transmitter.


def hackerland_radio_transmitters(x, k):
    # Get the length of the array (number of houses)
    n = len(x)
    # Initialize counter for number of transmitters needed
    count = 0
    # Initialize index to track our position in the array
    index = 0
    
    # Sort the array of house positions to process them in order
    x.sort()
    
    # Continue processing until we've covered all houses
    while index < n:
        # Increment the transmitter count each time we need a new one
        count += 1
        
        # Find the rightmost house that can be covered by a transmitter placed at the current house + k
        y = x[index] + k

        # Move the index until we find a house that's beyond the current coverage range
        while index < n and x[index] <= y:
            index += 1
        
        # Place the transmitter at the rightmost house within range to maximize coverage
        # The index-1 refers to the last house that was within range
        y = x[index - 1] + k
        # Move the index to the first house not covered by the placed transmitter
        while index < n and x[index] <= y:
            index += 1
    
    # Return the total number of transmitters needed
    return count
