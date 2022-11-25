#TC: O(n)
#SC: O(1)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows==1: return [[1]]
        result=[[1],[1,1]]
        for i in range(2,numRows):
            cur_row=[0]*(i+1)
            cur_row[0],cur_row[-1]=1,1
            for j in range(1,i):
                cur_row[j]=result[i-1][j-1]+result[i-1][j]
            result.append(cur_row)

        return result
