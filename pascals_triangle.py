Time and space complexity = O(NumRows^2)
Did it execute in leetcode: Yes
Challenges: Got stuck at few points.

Comments: Given below
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        # Boundary condition
        if not numRows:
            return []
        
        # Result matrix
        result = []
        
        # Append the first row value as 1
        result.append([1])
        
         # Create a loop
        for i in range(1,numRows):
        
            # Empty list to store solution
            list = []
            
            # First column value is always 1
            list.append(1)
            
            # For the columns between the first and last column, 
            # value is the sum of previous row's values of same column and previous column
            for j in range(1,i):
                value = result[i-1][j] + result[i-1][j-1]
                list.append(value)
                
            # The last column value is always 1
            list.append(1)
            
            # Append list to the result list
            result.append(list)
        
        # Return the solution
        return result
