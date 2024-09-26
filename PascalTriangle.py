# Time Complexity : O(N ^ (2))
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        result = []
        for i in range(numRows): 
            result.append([1] * (i + 1))
            for j in range(i + 1):
                if j != 0 and j != i: #first and last element of each row is always 1
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j]
        
        return result