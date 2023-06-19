"""
Problem : 1

Time Complexity : O(n^2)
Space Complexity : O(n^2)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Initializing a row array with all 1's, as 1st and 2nd rows are just [1] and [1,1]
for next row array, taking the last added row in the result array, and summing its
adjacent number except the first and last number

"""

# Pascal's Triangle

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        res=[]

        for i in range(numRows):
            arr=[1 for _ in range(i+1)]
            if i>=2:
                for j in range(1,i):
                    arr[j]=res[i-1][j-1]+res[i-1][j]
            res.append(arr)
        return res

