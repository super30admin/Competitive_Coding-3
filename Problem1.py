class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        output=[]
        
        for i in range(numRows):
            output.append([])
            for j in range(i+1):
                if j in (0,i):
                    output[i].append(1)
                else:
                    output[i].append(output[i-1][j-1]+output[i-1][j])
        
        return output
            