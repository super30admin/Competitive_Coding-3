#Time Complexity : O(n^2) where n is number rows
#Space Complexity : O(1)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Initialize a 2D array with [[1], [1,1]] as this never changes (except handling numRows=0 and numRows=1) then for each row, we know that the first and last elements are 1 so we initialize temp array to [1] after which, to find the value at each index (not including the first and last column of each row) is equal to the sum of the two elements which are in the above row, one being in the column before the current element and one being in the same column as the element. Then we finally append the last 1 (of the last column) to the temp array and append this array to our result.

#Your code here along with comments explaining your approach

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []

        arr = [[1], [1,1]]

        if numRows == 1:
            return [[1]]

        for row in range(2, numRows):
            temp = [1]
            for col in range(1,row):
                temp.append(arr[row-1][col-1]+arr[row-1][col])
            temp.append(1)
            arr.append(temp)

        return arr
