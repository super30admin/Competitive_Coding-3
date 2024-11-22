'''
Time Complexity : O(n)
Space Complexity :O(1)
Did this code successfully run on Hackerrank : Yes
Any problem you faced while coding this : Yes, I'm facing a problem currently.
                                        I have written two functions to calculate
                                        results. However, when I submit the code,
                                        It keeps failing on a single test case
                                        which is too large.(Test case #1 on Hackerrank)
                                        I tried debugging but couldn't find the issue.
                                        Could you please explain why the commented code fails?


My code here along with comments explaining the approach
'''
'''#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'maxSubarray' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY arr as parameter.
#

# In this approach, I find the sum of all the elements
# Take 2 pointers at the ends of the array and move the
# pointer having the lower element. Update the max_sum,
# move the respective pointer and repeat until pointers meet.
def find_max_subarray_sum(arr):
    max_sum = 0
    low = 0
    high = len(arr) - 1
    for i in range(0, high + 1):
        max_sum += arr[i]
    running_sum = max_sum
    while(low <= high):
        if low == high:
            running_sum = arr[low]
            high -= 1
            
        elif arr[low] > arr[high]:
            running_sum -= arr[high]
            high -= 1
            
        else:
            running_sum -= arr[low]
            low += 1
        
        max_sum = max(max_sum, running_sum)
    
    return max_sum

    # Find the max_sum possible, if all numbers are -ve then return max_element
def find_max_subseq_sum(arr):
    max_sum = 0
    for num in arr:
        if num > 0:
            max_sum += num
    
    return max_sum if max_sum > 0 else max(arr)

def maxSubarray(arr):
    # Write your code here
    # Null check
    if (not arr) or len(arr) == 0:
        return [-1, -1]
    
    # Two objectives:
    # 1. Find maximum subarray sum.
    subarray_sum = find_max_subarray_sum(arr)
    # 2. Find max subsequence sum.
    subseq_sum = find_max_subseq_sum(arr)
    
    # Return max sums in a list
    return [subarray_sum, subseq_sum]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())

        arr = list(map(int, input().rstrip().split()))

        result = maxSubarray(arr)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
'''

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'maxSubarray' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def maxSubarray(arr):
    # Write your code here
    # Null check
    if (not arr) or len(arr) == 0:
        return [-1, -1]
    
    # # Two objectives:
    # # 1. Find maximum subarray sum.
    # subarray_sum = find_max_subarray_sum(arr)
    # # 2. Find max subsequence sum.
    # subseq_sum = find_max_subseq_sum(arr)
    
    subseq_sum = arr[0]
    subarr_sum = arr[0]
    
    if len(arr) == 1:
        return [subarr_sum, subseq_sum]
    
    for i in range(1, len(arr)):
        subseq_sum = max(subseq_sum, arr[i], arr[i] + subseq_sum)
        arr[i] = max(arr[i], arr[i] + arr[i - 1])
        subarr_sum = max(subarr_sum, arr[i])
    
    # Return max sums in a list
    return [subarr_sum, subseq_sum]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())

        arr = list(map(int, input().rstrip().split()))

        result = maxSubarray(arr)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
