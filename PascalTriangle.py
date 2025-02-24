# Time Complexity : O(n**2)
# Space Complexity : O(n**2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Understanding the concept of pascal triangle
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = []
    
        for i in range(numRows):
            row = [1] * (i + 1)
            for j in range(1, i):
                row[j] = triangle[i-1][j-1] + triangle[i-1][j]
            triangle.append(row)
    
        return triangle