"""
Time complexity is O(N^2)
Space Complexit is O(1)

-> For each row , if its 1st or last column append 1
-> For rest of the columns, append 
"""


class Solution_PascalTri:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows ==0:
            return []
        res=[]
        for i in range(numRows):
            temp=[]
            for j in range(0,i+1):
                if j==0 or j==i:
                    temp.append(1)
                else:
                    print(i,j)
                    left=res[i-1][j-1]
                    right=res[i-1][j]
                    sum1=left+right
                    temp.append(sum1)
            res.append(temp)
        return res
        
        