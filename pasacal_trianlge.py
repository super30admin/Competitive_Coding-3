class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        list = []
        for i in range(numRows):
            row = [None for x in range(i+1)]
            row[0], row[-1] = 1,1
            for j in range(1,len(row)-1):
                row[j] = list[i-1][j-1] + list[i-1][j]
            list.append(row)
        return list
            