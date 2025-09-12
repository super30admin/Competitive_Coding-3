# Time Complexity : O(N^2)
# Space Complexity : O(N^2)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using a nested loop to generate the pascal triangle.
# The outer loop is for the number of rows and the inner loop is for the number of columns.
# I am initializing the first and last element of each row to 1.
# For the other elements, I am adding the two elements above it to get the current element.
# Finally, I am returning the list of lists which contains the pascal triangle.

from typing import List
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = []
        for i in range(numRows):
            r = [1] * (i+1)
            for j in range(1,i):
                r[j] = ans[i-1][j-1]+ans[i-1][j]
            ans.append(r)
        return ans
        