# This is solution for:
# TC = O(N^2)
# SC = O(N)
# since we are creating a new row each time we append it to result
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        result.append([1])
        if numRows == 1:
            return result
        else:
            result.append([1,1])
            for i in range(1,numRows-1):
                row = []
                prevL = result[i]
                row.append(prevL[0])
                for j in range(len(prevL)-1):
                    first = prevL[j]
                    second = prevL[j+1]
                    row.append(first+second)
                row.append(prevL[-1])
                result.append(row)
        return result


# python way
# TC = O(N^2)
# SC = O(1)
numRows = 5

mat = [[1]*(i+1) for i in range(numRows)]

for i in range(numRows):
    for j in range(i):
        if j != 0 and j != i:
            mat[i][j] = mat[i-1][j-1] + mat[i-1][j]
            
print(mat)