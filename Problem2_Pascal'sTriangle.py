'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''
'''
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly 
above it as shown:

https://leetcode.com/problems/pascals-triangle/
'''

#-----------------
# Time Complexity: 
#-----------------
# O(N^2): Where N is the numRows. Need to iterate over each column in each row
#         no. of columns in row = row_index (1,...,numRows)

#------------------
# Space Complexity: 
#------------------
# O(1): No auxiliary data structure required. Only output array and variables
#       If output data structure is considered, then cannot do it in 
#       O(N) space because we NEED to return a list of a list.
#       If we only need to return last row, then we can only store the last
#       row in result and store temporary variable which will store previous
#       iteration of result

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  32 ms (61.29 %ile)
# Space            :  14.2 MB (80.64 %ile)



class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return [[]]
        
        else:
            result = [None] * numRows
            result[0] = [1]
            i = 0
            # print(result, numRows)
            while i < numRows-1:
                i+=1
                # print(f"i:{i}")
                result[i] = [None] * (i+1)
                # print(result)
                for j in range(i+1):
                    # print(f"    j:{j}")

                    left = j-1
                    # print(f"    left:{left}")
                    if left >= 0:
                        left = result[i-1][left]
                    else:
                        left = 0
                    
                    right = j
                    # print(f"    right:{right}")
                    if right <= i-1:
                        right = result[i-1][right]
                    else:
                        right = 0
                    
                    result[i][j] = left + right

            return(result)