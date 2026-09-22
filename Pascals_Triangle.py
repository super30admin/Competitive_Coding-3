# Time Complexity : O(N2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
#I have used 2 loops for numRows and initialized array with list of numRows
#First and last element of list of list is initialized with 1
#Then we will take the previous appended list and add it and append to current array

class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        if numRows == 0:
            return []
        if numRows == 1:
            return [[1]]
        result = []
        for i in range(numRows):
            arr = [0] * (i+1)
            arr[0] = 1
            arr[-1] = 1
            for j in range(1, i):
                arr[j] = result[i-1][j-1] + result[i-1][j]
            result.append(arr)
        return result
