"""
Time complexity O(n log n) Greedy approach
"""

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the hackerlandRadioTransmitters function below.
def hackerlandRadioTransmitters(x, k):
    x.sort()
    n=len(x)
    count=0
    i=0
    while(i<n):
        count+=1
        loc=x[i]+k
        while(i<n and x[i]<=loc):
            i+=1
        i-=1
        loc=x[i]+k
        while(i<n and x[i]<=loc):
            i+=1
    return count

    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    x = list(map(int, input().rstrip().split()))

    result = hackerlandRadioTransmitters(x, k)

    fptr.write(str(result) + '\n')

    fptr.close()
