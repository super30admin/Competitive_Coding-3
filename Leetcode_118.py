#Time Complexity: O(n**2)
#Space Complexity: O(n**2)

class Solution:
    def generate(self, numRows: int) :
        result = []
        
        if numRows < 1:
            return result
 
        for i in range(0, numRows):            
            row = []
            
            if i == 0:
                row.append(1)
            else:   
                row.insert(0, 1)
                row.insert(i, 1)
                
                for j in range(1, i):
                    left_above = result[i - 1][j  - 1]
                    right_above = result[i - 1][j]
                    row.insert(j, left_above + right_above)
                
            result.append(row)
                    
        return result