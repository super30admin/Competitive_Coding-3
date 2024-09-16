class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if not numRows:            
            return
        
        trianle = []
        
        for i in range(numRows):
            row = [None] * (i+1)
            row[0]= 1
            row[-1]=1
            
            for j in range(1,len(row)-1):
                row[j] = trianle[i-1][j] + trianle[i-1][j-1]
            
            trianle.append(row)
        return trianle
