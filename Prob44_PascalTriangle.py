#Time Complexity : O(n²)
#Space Complexity : O(n²)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
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
