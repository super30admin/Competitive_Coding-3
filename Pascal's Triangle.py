# Time Complexity :
# O(number of elements in pascal's triangle)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# YES

# Any problem you faced while coding this :
# NO

# Approach

# I am iterating through each row and and filling first and last indxes of each row with 1
# and filling other indexs with sum of two elements which are present at same position and one less position in previuos row

# Your code here along with comments explaining your approach

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        result = []
        
        for i in range(numRows):
            row = []
            
            for j in range(i+1):
                if (j==0 or j==i):
                    row.append(1)
                else:
                    row.append(result[i-1][j-1] + result[i-1][j])
                
                    
            result.append(row)
            
        return result