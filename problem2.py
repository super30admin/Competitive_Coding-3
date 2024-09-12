#Time Complexity O(N^2)
#Space Complexity O(N)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        for x in range(1,numRows):
            temp = [1]
            if x >=2:
                for y in range(0,x-1):
                    temp.append(result[x - 1][y] + result[x - 1][y + 1])
            temp.append(1)
            result.append(temp)
        return result
            
            
            
            
        
