"""
Time Complexity : O(n^2) where n is the number of rows. The number of elements in a list are n*(n+1)/ 2
Space Complexity : O(n) where n is the number of rows. In worst case there can be maximum n numbers present in a temp list.
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
1. Length of the internal list is equal to the index+1 of the resultant list.
2. number = prevRow[currIndex -1] + prevRow[currIndex] 
"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        for i in range(0, numRows):
            temp = []
            for j in range(0, i+1):
                if j == 0 or j == i:
                    temp.append(1)
                else:
                    left = result[i-1][j-1]
                    right = result[i-1][j]
                    temp.append(left+right)
            result.append(temp)
        return result