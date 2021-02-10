"""
118. Pascal's Triangle
Time Complexity - O(n^2)
Space Complexity - O()
for rows will be 0 to numRows-1
    initialize a temp
    for columns limit from 0 to rows
        if column is 0 or row
            append 1
        else
            output[row-1][column-1] + output[row-1][column]
    append temp in output list
    
        """
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        output = [] 
        for row in range(0,numRows):
            temp = []
            for column in range(0,row+1):
                if (column == 0) or (column == row):
                    temp.append(1)
                else:
                    temp.append(output[row-1][column-1] + output[row-1][column])
            output.append(temp)
        return output
        