# // Time Complexity : o(n2)
# // Space Complexity : o(n2)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : implementing the 2 d matrix


# // Your code here along with comments explaining your approach
# idea is to store the result in a dp array and build the result observe the relation between the i and number of elements 
# first and 2nd rows can be already filled start filling 3rd row from index 1 to the i-1 index by the formula inplace 



from typing import List
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1] * (i+1) for i in range(numRows)]
        for i in range(2, numRows):
            for j in range(1,i):
                res[i][j] = res[i-1][j-1] + res[i-1][j]
        return res

# Question asked in interview given a k find the list approach similar to above 

# class Solution:
#     def getRow(self, rowIndex: int) -> List[int]:
#         res = [1]
#         for i in range(1,rowIndex+1):
#            for j in range(i, 0,-1):
#             if j == i:
#                 res.append(1)
#             else:
#                 res[j] = res[j-1] + res[j]
#         return res

            

        