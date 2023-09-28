# Time Complexity: O(n^2)
# Space Complexity: O(n^2)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        finalNums=[]
        finalNums.append([1])
        for i in range(numRows-1):
            newRow=[1]
            for j in range(i):
                newRow.append(finalNums[i][j]+finalNums[i][j+1])
            newRow.append(1)
            finalNums.append(newRow)
        return finalNums