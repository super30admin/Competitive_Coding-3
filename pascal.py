class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
#        TC===O(n^2)
#  Sc=O(n^2)
        res=[[1]]
#        nom of rows 
        for i in range(numRows-1):
            row=[]
            temp=[0]+res[-1]+[0]
#            generTing the each element in a row
            for j in range(len(res[-1])+1):
                row.append(temp[j]+temp[j+1])
            res.append(row)
        return res