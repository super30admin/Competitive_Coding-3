# TC - O(n^2)
# SC - n

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        # First row is always 1 so adding the 1st row to res
        res = [[1]]
        #as we have added the 1st row already now we have to construct numRows-1 number of rows
        for i in range(numRows-1):
            temp = [0] + res[-1] + [0]
            row = []
            # to formulate new row everytime we calculate the list valuses as per given condition and append it to our result
            for j in range(len(res[-1]) +1):
                row.append(temp[j]+temp[j+1])
            res.append(row)
        return res