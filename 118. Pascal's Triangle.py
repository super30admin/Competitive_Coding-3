#Time: O(n^2)
#Space: O(1)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if ( numRows == 1):
            return [[1]]
        mainlist = [[1],[1,1]]
        for i in range(2,numRows):
            secondlist= [1]
            for j in range(1,i):
                value= mainlist[i-1][j-1] + mainlist[i-1][j]
                secondlist.append(value)
            secondlist.append(1)
            mainlist.append(secondlist)
        return mainlist
