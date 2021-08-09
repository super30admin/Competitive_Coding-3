"""
//Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        triangle=[]
        triangle.append([1])
        for i in range(1,numRows):
            pascal = []
            pascal.append(1)
            for j in range(1,i):
                pascal.append(triangle[i-1][j-1]+triangle[i-1][j])
            pascal.append(1)
            triangle.append(pascal)
        return triangle