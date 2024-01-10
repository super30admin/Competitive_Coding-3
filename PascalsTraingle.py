#Time : O(n^2) 
#Space : O(1) 

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result=[]
        
        for i in range(numRows):
            newRow =[]
            for j in range(0, i+1):
                if (j==0 or j==i):
                    newRow.append(1)
                else:
                    left = result[i-1][j-1] + result[i-1][j]
                    newRow.append(left) 

            result.append(newRow)
        return result