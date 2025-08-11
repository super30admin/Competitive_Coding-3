# Pascal's Triangle
# https://leetcode.com/problems/pascals-triangle/
# Time Complexity: O(n^2)
# Space Complexity: O(n^2)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        # Initialize the first row
        res = [[1]]
        # The outer loop runs for numRows-1 times since the first row is already added and it keeps tracking the number of rows
        for i in range(numRows-1):
            # For each row, we create a new list to hold the values
            output = []
            # The last row is used to calculate the next row
            temp = res[-1]
            # The inner loop runs for the length of the last row plus one to account for the new element at the end
            for j in range(len(res[-1])+1):
                # The first and last elements of each row are always 1
                if j==0 or j==len(temp):
                    output.append(1) 
                # For other elements, we sum the two elements above it
                else:
                    output.append(temp[j]+temp[j-1])
            res.append(output)
        return res
        

# To optimize space, we can use a single list 
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1]]
        for i in range(numRows-1):
            # Add a leading and trailing zero to the last row
            temp = [0] + res[-1] +[0]
            res.append([temp[j] + temp[j+1] for j in range(len(temp)-1)])   
        return res
        