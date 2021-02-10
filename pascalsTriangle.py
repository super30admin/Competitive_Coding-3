#TimeComplexity:O(N*N) where N is numRows
#SpaceComplexity: O(N*N)
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        Sol=[]
        if numRows==0:
            return Sol
        for i in range(numRows):
            Arr=[None for _ in range(i+1)]
            Arr[0],Arr[-1]=1,1
            for j in range(1,i):
                Arr[j]=Sol[i-1][j-1]+Sol[i-1][j]
            Sol.append(Arr)


        return Sol
        

