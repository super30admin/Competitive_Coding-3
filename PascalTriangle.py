# Apporach:

# Its a simple algorithm. We will loop in the range of no of rows required and in each loop we will add a new row. Each new row's first and last value would be taken and 1. Now each value in this new row be caluclated by summing the value one row above and the value one row above to the left. And after each iteration this newly made row will be added to the result.

# Time Complexity: O(n); n = no of rows
# Time Complexity: O(n); n = no of rows
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        triangle = []
        
        for rowNo in range(numRows):
            row = [None for _ in range(rowNo+1)]
            row[0] = 1
            row[-1] = 1
            
            for j in range(1, len(row)-1):
                row[j] = triangle[rowNo-1][j-1] + triangle[rowNo-1][j]
                
            triangle.append(row)
            
        return triangle