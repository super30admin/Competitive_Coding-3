# 118. Pascal's Triangle
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        output = []
        def getRow(r,c):
            result = [1]
            ans = 1

            for i in range(1,r+1):
                ans = ans * ((r+1)-i) // i
                result.append(ans)
            return result

        for i in range(numRows):
            output.append(getRow(i,i+1))

        return output


        
        
            
            






        