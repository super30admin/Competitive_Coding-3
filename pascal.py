# Time Complexity : O(m * n) for m rows and n columns
# Space Complexity : O(m * n) for m rows and n columns as we are storing the result every time
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I was getting stuck at the column range



class Solution:

    def pascalTriangle(self, numRows):
        
        if numRows == 1:
            return [[1]]
        elif numRows == 2:
            return [[1], [1, 1]]
        else:
            arr = [[1], [1, 1]]
            for i in range(2, numRows):
                arr.append([1])
                for j in range(1, i):

                    arr[i].append(arr[i-1][j-1] + arr[i-1][j])
                arr[i].append(1)
        return arr