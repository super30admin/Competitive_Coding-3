# // Time Complexity : O(n^2)
# // Space Complexity : O(n^2)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
 
#  Approach: 
# 1. If the numRows are 0, return empty array
# 2. If the numRows are 1, return arraylist containing [1] as a single array
# 3. If numRows are greater than 1, construct an output list and traverse through all the rows one by one as follows:
#           create a row list and append 1 to it (as the boundaries of pascal triangle have value 1)
#           for the elements inside the boundaries, loop through the middle elements of the row and add the values at [i-1][j-1] and [i-1][j] to get the current value at the current row.
#           append 1 to the end of the row
#           add this entire row list to the output list

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        if numRows == 0:
            return []
        elif numRows == 1:
            return [[1]]
        else:
            output = [[1]]
            for i in range(1, numRows):
                row = [1]
                for j in range(1, i):
                    row.append(output[i-1][j-1] + output[i-1][j])
                row.append(1)
                output.append(row)
            
            return output
                
                
        