def generate(self, numRows: int) -> List[List[int]]:
        res=[[1]]
        # if numRows>=1:
        #     res.append([1])
        # if numRows>=2:
        #     res.append([1,1])
        # res[0]=1
        # res[1]=[1,1]
        for i in range(1,numRows):
            temp=[1]
            for j in range(1,i):
                temp.append(res[i-1][j-1]+res[i-1][j])
            temp.append(1)
            res.append(temp)
        return res
        