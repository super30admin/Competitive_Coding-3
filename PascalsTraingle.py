class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        resrow = list()
        for i in range(numRows):
            row = list()
            for j in range(i + 1):
                if (j == 0) or (j == i):
                    row.append(1)
                else:
                    l = resrow[i - 1][j - 1]
                    r = resrow[i - 1][j]
                    row.append(l + r)
            if row != None:
                resrow.append(row)
        return resrow
