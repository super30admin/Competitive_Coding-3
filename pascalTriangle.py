"""Approach:
Simple loop over the numRows and for each row, loop over every column and append 1 or append r[i-2][j-1] + r[i-2][j]
TC O(numRows^2)
SC O(1) cause we ignore the space used by results array which is also O(numRows^2)
"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        r = []
        for i in range(numRows):
            # create empty row of size i
            row = [None for _ in range(i + 1)]
            # set first and last element to 1
            row[0], row[-1] = 1, 1
            # for j in 1 to len(row)-1 i.e. till 2nd last element do the loop below
            for j in range(1, len(row)-1):
                row[j] = (r[i-1][j-1] + r[i-1][j])
            # finally append row to result
            r.append(row)
        return r
        