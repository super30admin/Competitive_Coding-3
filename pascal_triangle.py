# TC: O(n^2)
# sc: O(N^2)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res=[]
        if numRows==1:
            lis=[1]
            res.append(lis)
            return res
        else:
            res=[[1]]
            for i in range(1,numRows):
                lis=[1]
                for j in range(0,i+1):
                    if j<i-1:
                        k=res[-1][j]+res[-1][j+1]
                        lis.append(k)
                lis.append(1)
                print(lis)
                res.append(lis)
        return res

        
        