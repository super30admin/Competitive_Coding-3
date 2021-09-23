"""
In the pascals triange we will iterate the row pointer in range numrows and the column pointer in range i+1 so that
current column has 1 more element than the current row. The value in the current row will be sum of the value in the previos row same column and previous
row previous column. We will append the results for each row in a row array and finally append it to result array.
TC: O n square
sc: O n square


"""

class Solution:
    def generate(self, numRows: int):
        result=[]
        for i in range(numRows):
            row=[]
            for j in range(i+1):
                if j==i or j==0:
                    row.append(1)
                else:
                    leftvalue=result[i-1][j-1]
                    rightvalue=result[i-1][j]
                    sum=leftvalue+rightvalue
                    row.append(sum)
            result.append(row)
        return result

numsRows=5
solve=Solution()
print(solve.generate(numsRows))