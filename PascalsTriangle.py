"""
Given an integer numRows, return the first numRows of Pascal's triangle.

"""

# Time Complexity : O(n) + O(n^2) = O(n^2)
# Space Complexity : O(1) 
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this : No

from typing import List

def generate(numsRows: int) -> List[List[int]]:

    tri = []

    i = 0
    
    # creating a incrementing triangle with all 1's till length of numRows
    for i in range(numsRows):
        tri.append([1]*(i+1))
    
    # Since each row has repeated subproblems, we can use recursion or dynamic programming. 
    # Using dynamic programming, calculating sum for each element using previous elements
    for i in range(2, numsRows):
        for j in range(1, i):
            tri[i][j] = tri[i-1][j-1] + tri[i-1][j]

    # return the list
    return tri


result = generate(5)
print(result)


