
"""
118. Pascal's Triangle
Easy
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

 
Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:
Input: numRows = 1
Output: [[1]]

 
Constraints:

1 <= numRows <= 30


"""

class Solution:
    """
    ACcepted
    Time Complexity: O(n^2)
    Space Complexity: O(n^2)
    
    Explanation: Bruteforce solution. We generate the triangle by using the previous row.
    Combination formula. Essentially to calculate the value at a given index, we need to calculate the value at the previous index and the value at the previous index - 1.
    Basically, go up and go up and left. add these two values to get the current value.
    """
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0: return []
        res = [[1]]
        for idx in range(2, numRows + 1):
            curr = [0 for _ in range(idx)]
            curr[0], curr[-1] = 1, 1 # mark for the first and last element as 1, that's the rule
            prev = res[-1]
            i, j = 0, 1 # up and up-left
            k = 1 # start from the second element as first and last are already marked
            while j < len(prev):
                curr[k] = prev[i] + prev[j] #formula
                i += 1
                j += 1
                k += 1
            res.append(curr)
        return res

LeetCode(PROBLEM, Solution).check()
