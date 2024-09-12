#Time complexity: O(n^2) where n is the number of rows required
#Space complexity: O(1) no extra space

#Accepted on Leetcode

#Approach
#Simulate the construction of pascal's triangle by creating a 2d array, each row has one more element than the last
#Sum of element at a given index is equal to the two elements above it (i-1,j) + (i-1, j+1)
#Handle edge cases such as out of bounds


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        soln = [[1]]
        curRow = []
        for i in range(1,numRows):
            curRowSize = i + 1
            for j in range(0, curRowSize):
                val1 = soln[i-1][j-1] if j > 0 else 0
                val2 = soln[i-1][j] if j < curRowSize - 1 else 0
                curRow.append(val1 + val2)
            soln.append(curRow)
            curRow = []
        
        return soln

    
    # nR = 5, soln = [[1]], curRow = []
    # i 1 -> 4 inclusive
    # i = 1, curRowSize = 2
    # j -> 0 to 1 inclusive
    # i = 1, j = 0, val1 = soln[0][-1] i.e 0, val2 = soln[0][0] 1, curRow.append(1)
    # i = 1, j = 1, val1 = soln[0][0] = 1, val2 = soln[0][1] i.e 0, curRow.append(2)

    # i = 2, j = 0, val1 = soln[1][-1] i.e 0, val2 = soln[1][0] i.e 1, curRow.append(1)
    # i = 2, j = 1, val1 = soln[1][1] i.e 1, val2 = soln[1][1] i.e 2, curRow.append(2)
    # i = 2, j 

