# Time Complexity: O(n^2)
# Space Complexity: O(1)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        if numRows == 0:
            return []
        res = [[1]]
        

        for i in range(1, numRows):
            # capture the previous row
            prev = res[-1]
            
            # create a new row to append
            # the first and last element of each row is always 1
            row = []
            for j in range(i+1):
                
                if j==0:
                    row.append(1)
                elif j == i:
                    row.append(1) 
                else:
                    # print(res)
                    # the output is the sum of the two elements above it
                    # prev[j-1] is the element above and to the left
                    # prev[j] is the element above and to the right
                    output = prev[j-1] + prev[j]
                    row.append(output)
            res.append(row)
        return res
