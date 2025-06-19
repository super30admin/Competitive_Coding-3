# // Time Complexity : O(n^2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        pt = []

        for i in range(numRows):
            row = [1] * (i + 1)

            for j in range(1, i):
                row[j] = pt[i-1][j-1] + pt[i-1][j]
            
            pt.append(row)
        
        return pt