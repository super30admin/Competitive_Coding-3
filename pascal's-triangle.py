"""
Runtime Complexity:
O(n^2) - we run two nested for loops. One to generate a 1D dp array of size n. The next for loop is to compute
the value of j in range from 1 to len(rows)-1. We then append this list to our result list(triangle).
Space Complexity:
O(1) - we were expected to return list of lists. No extra space was required to compute the solution. Therefore it's constant.
Yes,the code worked on leetcode.
Issues while coding- index out of range. Figured out and declared rows[-1] = 1 to avoid index out of bounds error. 
"""


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        triangle = []
        for row_num in range(numRows):
            rows = [None for i in range(row_num+1)]
            rows[0]=1
            rows[-1]=1
        
            for j in range(1,len(rows)-1):
                rows[j] = triangle[row_num-1][j-1]+triangle[row_num-1][j]
            triangle.append(rows)
        return triangle
        