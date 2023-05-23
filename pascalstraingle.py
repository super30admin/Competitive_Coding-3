class PascalTriangle(object):
    def getRow(self, rowIndex):
        if (rowIndex == 0):
            return [1]
        if (rowIndex == 1):
            return [1, 1]

        prevRow = [1, 1]

        for i in range(2, rowIndex + 1):

            currRow = [1]

            for j in range(0, i - 1):
                currRow.append(prevRow[j] + prevRow[j + 1])
            currRow.append(1)

            prevRow = currRow

        return currRow
