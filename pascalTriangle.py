class Solution(object):
    # Time Complexity : O(n^2), where n is rowIndex
    # Space Complexity : O(n^2), where n rowIndex
    # Did this code successfully run on Leetcode : yes
    # Any problem you faced while coding this : no

    # Your code here along with comments explaining your approach

    # Pascal's Triangle II - https://leetcode.com/problems/pascals-triangle-ii/
    #
    # this approach uses a 2d array where each list is a level of the pascal's triangle,
    # by making numRow levels and forming each digit with sum from two digits from the
    # row above and returns only the last row for which the index was given.
    # This problem can also be done using permutations and combinations, but I'm not aware of the approach.
    def getRow(self, rowIndex):
        if rowIndex < 0:
            return []
        if rowIndex == 0:
            return [1]

        retVal = [[1]]

        for i in range(1, rowIndex + 1):
            retVal.append([1])
            for j in range(1, i):
                num1 = retVal[i - 1][j - 1]
                num2 = retVal[i - 1][j]
                retVal[i].append(num1 + num2)
            retVal[i].append(1)

        return retVal[-1]

#------------------------------------------------------x---------------------------------------------------------------#

    # Time Complexity : O(n^2), where n is numRows
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : yes
    # Any problem you faced while coding this : no

    # Your code here along with comments explaining your approach

    # Pascal's Triangle I - https://leetcode.com/problems/pascals-triangle/
    #
    # this approach uses a 2d array where each list is a level of the pascal's triangle,
    # by making numRow levels and forming each digit with sum from two digits from the
    # row above and returns the whole matrix with number of levels provided.
    # This problem can also be done using permutations and combinations, but I'm not aware of the approach
    def generate(self, numRows):
        if numRows <= 0:
            return []
        if numRows == 1:
            return [[1]]

        retVal = [[1]]

        for i in range(1, numRows):
            retVal.append([1])
            for j in range(1, i):
                num1 = retVal[i - 1][j - 1]
                num2 = retVal[i - 1][j]
                retVal[i].append(num1 + num2)
            retVal[i].append(1)

        return retVal


# number of rows, prints the entire matrix.
print(Solution().generate(10))
# index starting at 0, only prints the last level.
print(Solution().getRow(9))
