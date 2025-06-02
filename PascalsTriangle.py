class Solution:
    def PascalTriangle(self, numRows):
        triangle=[]
        for i in range(numRows):
            row=[1]*(i+1)
            for j in range(1,i):
                row[j]=triangle[i-1][j-1]+triangle[i-1][j]
            triangle.append(row)

        return triangle
    
sol=Solution()
print(sol.PascalTriangle(5))

