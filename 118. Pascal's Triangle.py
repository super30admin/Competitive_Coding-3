"""
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        """
        Run Time Complexity: O(N*N)
        Space Complexity : O(N*N)
        
        Loop through and update the elements
"""
        
        res  = []
        for num in range(numRows):
            row = [None for _ in range(num+1)]
            row[0] = 1
            row[-1] = 1
            for j in range(1, len(row)-1):
                row[j] = res[num - 1][j-1] + res[num-1][j]
            res.append(row)
        return res
                
        