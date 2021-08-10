#Leetcode problem: 118
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans=[]
        
        for i in range(numRows):
            mid=[]
            for j in range(i+1):
                if j==0 or i==j:
                    mid.append(1)
                else:
                    mid.append(ans[i-1][j-1]+ans[i-1][j])
            ans.append(mid)
        return ans

#TC: O(n^2)
#SC: O(1)