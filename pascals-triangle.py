class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        if numRows == 1:
            return [[1]]
        if numRows == 2:
            return [[1],[1,1]]
        
        result = [[1],[1,1]]
        counter = 2
        
        while counter < numRows:
            res1= []
            
            for i in range(0,counter+1):
                if i == 0 or i == counter:
                    res1.append(1)
                else:
                    res1.append(result[counter-1][i-1]+result[counter-1][i])
        
            result.append(res1)        
            counter+=1
            
        
        return result
        