#Competitive Coding 3
#Problem2 : https://leetcode.com/problems/pascals-triangle/
#All test cases passed on Leetcode
#Time Complexity-O(N*N)
#Space Complexity-O(1)

class Solution:
    def generate(self, numRows):
        
        if numRows==0:
            return []
        elif numRows==1:
            return [[1]]
        tri=[[1]]
        for i in range(1,numRows):
            row=[1]
            for j in range(1,i):
                row.append(tri[i-1][j-1]+tri[i-1][j])
            row.append(1)
            tri.append(row)
        return tri
            
sol = Solution()
n=5
tri=sol.generate(n)
print(tri)



        
        















