# Time complexity : O(n*n)
# Space complexity : O(n) --> elements in the last row
# Leetcode : Solved and submitetd

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        # edge cases for numRows = 0 or 1
        if numRows == 0:
            return []
        if numRows == 1:
            return [[1]]
        
        # currRow is used to store the curr row, res is for the final result
        # if numRows > 2, then we know the first 2 rows, so we add those to the result
        currRow = []
        res = []
        res.append([1])
        prev_row = [1,1]
        res.append(prev_row)
        
        # traverse from row 2 till the numRows
        for i in range(2,numRows):
            # add 1 to the start of the row
            currRow = [1]
            
            # for the other elements we add the prev_rows values to generat the curr row by adding the same column above and column to the right
            for j in range(0,i-1):
                currRow.append(prev_row[j] + prev_row[j+1])
            # last value in the column is 1, so we add that
            currRow.append(1)
            
            # add the currRow to the result
            res.append(currRow)
            
            # make the currRow as prev for the computation of next row
            prev_row = currRow
        
        return res
