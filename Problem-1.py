# Time Complexity :O(n^2)
# Space Complexity :O(k)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        #edge case
        if rowIndex == 0:
            return [1]
        # starting point
        sol = [1,1]
        # for each row
        for j in range(2,rowIndex+1):
            temp = [1]*(j+1)
            #sum the above two numbers for each position
            for i in range(1,j):
                temp[i] = sol[i-1]+sol[i]
            #save only a step before until you reach answer
            sol = temp
        #return answer
        return sol