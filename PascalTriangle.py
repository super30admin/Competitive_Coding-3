'''
Solution:
1.  Use only one array (previous one) to compute the next array's elements using the given formula of Pascal's triangle.

Time Complexity: O(n * n) -- For each row, calculate the entire row and there are n rows
Space Complexity: O(n) -- size of the last row

--- Passed all Testcases on Leetcode successfully
'''


class PascalTriangle(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        #   edge case checks
        if (rowIndex == 0):
            return [1]
        if (rowIndex == 1):
            return [1, 1]

        prevRow = [1, 1]

        for i in range(2, rowIndex + 1):
            #   initialize the current row
            currRow = [1]

            #   calculate the current row elements
            for j in range(0, i - 1):
                currRow.append(prevRow[j] + prevRow[j + 1])
            currRow.append(1)

            #   update the previous row to be current row for next iteration
            prevRow = currRow

        return currRow

