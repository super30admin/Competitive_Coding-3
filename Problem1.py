#https://leetcode.com/problems/pascals-triangle/description/
# Time Complexity: O(n^2), we build numRows rows, each row takes O(row length) time
# Space Complexity: O(n^2), we store all numRows rows in the result
#Did this code successfully run on Leetcode : Yes
# Approach: Row 0 is handled once upfront as [1], since it has no row above it.
# Every later row starts with 1, then each middle value is the sum of the two values
# directly above it from the previous row and finally ends with 1.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []         # will hold all the rows we build, e.g. [[1],[1,1],[1,2,1],...]
        result.append([1])  # row 0 is always [1], no calculation needed, handle it before the loop

        for i in range(1, numRows):  # i = current row index, starts at 1 since row 0 is already done
            previous_row = result[i - 1]  # the row directly above the one we're about to build
            current_row = []              # start this row completely empty
            current_row.append(1)        # left edge of the row is always 1
            for j in range(1, len(previous_row)):  # walk through the middle positions of previous_row
                current_row.append(previous_row[j - 1] + previous_row[j])  # sum of two values above
            current_row.append(1)               # right edge of the row - always 1
            result.append(current_row)           # store this completed row

        return result