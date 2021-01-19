# Created by Aashish Adhikari at 4:54 PM 1/18/2021

'''
Time Complexity:
O(n ^2)

Space Complexity:
O(1)
'''


class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """

        if numRows is None:
            return []

        sol = []



        for i in range(0,numRows):
            row = []

            for j in range(0, i+1):

                if j == 0 or j == i:
                    row.append(1)
                else:
                    row.append( sol[i-1][j-1] + sol[i-1][j] )

            sol.append(row)

        return sol
