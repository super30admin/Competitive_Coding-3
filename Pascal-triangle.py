# Time Complexity : O(N*N) - where n is numRows - sum of n terms formula
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        # Base Condition if numRows = 1
        output = [[1]]
        # loop from the first row
        for i in range(1,numRows):
            # construct row
            row  = []
            # get the elements of the row
            for j in range(i+1):
                # if first element then take first ele of prev
                if j == 0:
                    row.append(output[i-1][0])
                # if last element then take last ele of prev
                elif j == i:
                    row.append(output[i-1][len(output[i-1])-1]                
                # otherwise take sum of corresponding prev row ele plus prev ele
                else:
                    row.append(output[i-1][j-1]+output[i-1][j])
            # append row                               
            output.append(row)
        return output