#Time Complexity: O(numRows**2)
#Space Complexity:O(1)
def generate(self, numRows: int) -> List[List[int]]:
        triangle=[]
        for i in range(numRows):    
            row=[None for r in range(i+1)] 
            row[0]=1                      
            row[-1]=1                      
            for j in range(1,len(row)-1):  
                row[j]=triangle[i-1][j-1]+triangle[i-1][j]#row[1]=trangle[-1]
            triangle.append(row)
        return triangle

            