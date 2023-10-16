#Time Complexity : O(n^2) which is the best time complexity possible, as interpreted
#Space Complexity: O(1)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        if(numRows > 1):
            result.append([1,1])
        
        for i in range(3,numRows+1):
            result.append([1])
            for j in range(1,i):
                if(j == i-1) :
                    result[i-1].append(1)
                    continue
                result[i-1].append(result[i-2][j-1] + result[i-2][j])     
        return result
            
