#problem: Pascal's Triangle
#time complexity: O(n^2)
#space complexity: O(n^2)
#edge case: numRows = 0
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        triangle = [[1]]
        
        for i in range(1, numRows):
            row = [1] 
            for j in range(1, i):
                row.append(triangle[i-1][j-1] + triangle[i-1][j])
            row.append(1)  
            triangle.append(row)
        
        return triangle