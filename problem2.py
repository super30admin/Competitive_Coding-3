#brute force time-O(n**n)
#space-O(n)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans=[(i)*[1] for i in range(1,numRows+1)]
        #print(ans)
        for i in range(2,numRows):
            for j in range(1,i):
                ans[i][j]=ans[i-1][j-1]+ans[i-1][j]
        return ans
        
        
