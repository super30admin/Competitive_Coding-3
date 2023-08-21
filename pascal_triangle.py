# // Time Complexity :o(n^2)
# // Space Complexity :o(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no



class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """

        prev_row = [1]
        res = []
        res.append(prev_row)
        if (numRows == 1):
            return [prev_row]
        else:
            for i in range(1, numRows):
                medium = []
                for j in range(1, i):
                    prev_row = res[i - 1]

                    medium.append(prev_row[j - 1] + prev_row[j])
                x = [1] + medium + [1]
                res.append(x)
        return res

