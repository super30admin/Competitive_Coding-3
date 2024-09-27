# Time Complexity : O(numRows ^2)
# Space Complexity : O(numRows ^2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        # triangle list
        triangle = []
        
        
        for row_num in range(numRows):
            # + 1 to row since it's start index from 0
            # List comprehension to fill None to the given input
            row = [None for _ in range(row_num + 1)]
            
            # we know that row[0] and last row that is row[-1] is always 1.
            row[0], row[-1] = 1,1
            
            #it starts from next line until len(row) - 1
            for j in range(1, len(row)-1):
                # DP approach
                row[j] = triangle[row_num-1][j-1] + triangle[row_num-1][j]
            
            # append the updated row
            triangle.append(row)
        # return the triangle
        return triangle
