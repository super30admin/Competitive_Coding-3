"""
Time : O(N^2)
Space : O(N ^ 2)
Leetcode : yes
Any issues while solving : no
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        result = []
        for i in range(1, numRows+1):
            result.append([1] * i)
            
        print(result)
        for i in range(2,numRows):
            for j in range(1, i):
                result[i][j] = result[i-1][j-1] + result[i-1][j]
                
        return result