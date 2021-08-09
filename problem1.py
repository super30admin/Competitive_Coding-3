#pascals tirangle
#time complexity: O(n^2)
#space complexity : O(1)
#leetcode solution accepted
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows ==0:
            return []

        tri = [[1]*i for i in range(1,numRows+1)]#creating the sides of the array [1][11][1x1]
        
        for i in range(2,numRows):
            for j in range(1,i):
                tri[i][j]=tri[i-1][j]+tri[i-1][j-1] #calc the middle elements
        return tri
        