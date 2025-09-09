class Solution(object):
    # tc : O(n*2) each row, each element of it is calculated,
    # sc : O(1) 
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """

        # from the test case one thing observed is the number of elemenst in a row is equal to the row number so in 
        # 5th row we have 5 elements and the value is sum of the above two elements 
        # we need the aboce two value and for that above two values so on , which is to find a value in a recurriver way
        # and here we are having a case of overlaping sub problems where my intution goes to the dp 

        dp = [[1]*(i+1) for i in range(numRows)] # this creates 5 rows with all elemenst as 1

        # we know the first and last element of each row is 1 but for other values we need to add the above two 

        for i in range(2, numRows): # first 2 rows have 1's
            for j in range(1,i): # oth col is also 1 and for each row the max elements are the number of the row so till i
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j] # adding the above two elements

        return dp