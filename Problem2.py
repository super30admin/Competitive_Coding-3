'''
Time Complexity : O(nlogn) [O(nlogn) for sorting and O(n) to iterate over houses]
Space Complexity :O(1) [No extra space, only new variables initialized]
Did this code successfully run on Hackerrank : Yes
Any problem you faced while coding this : Yes, I couldn't come up with the solution
                                        intuitively. Had to ask ChatGPT for the approach.
                                        Then coded the solution.

'''



#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'hackerlandRadioTransmitters' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY x
#  2. INTEGER k
#

def hackerlandRadioTransmitters(x, k):
    # Write your code here
    n = len(x)
    idx = 0
    count = 0
    # Step 1: sort the houses
    x.sort()
    # Step 2: Iterate through houses and place antennae with greedy approach
    while idx < n:
        # Add an antenna to place
        count += 1
        # Step 3: Locate the farthest house in range
        farthest = x[idx] + k
        while idx < n and x[idx] <= farthest:
            idx += 1
        # Step 4: location of the farthest house is just the previous index
        idx -= 1    # This is where we place the antenna
        # Step 5: Find the farthest location from antenna placement
        farthest = x[idx] + k
        # loop below will take index just out of the range
        # this would help in placing next antenna
        while idx < n and x[idx] <= farthest:
            idx += 1
    
    # Final step: return count of minimum antennae
    return count
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    k = int(first_multiple_input[1])

    x = list(map(int, input().rstrip().split()))

    result = hackerlandRadioTransmitters(x, k)

    fptr.write(str(result) + '\n')

    fptr.close()
