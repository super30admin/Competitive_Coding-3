"""
Time Complexity is O(n)
Space complexity is O(1)
"""
#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the maxSubarray function below.
def maxSubarray(arr):
    n=len(arr)
    prevsum=arr[0]
    maxsum=arr[0]
    subsum=arr[0]
    for i in range(1,n):
        prevsum=max(arr[i],prevsum+arr[i])
        maxsum=max(maxsum,prevsum)
        subsum=max(max(subsum,arr[i]),subsum+arr[i])
    return[maxsum,subsum]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        arr = list(map(int, input().rstrip().split()))

        result = maxSubarray(arr)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
