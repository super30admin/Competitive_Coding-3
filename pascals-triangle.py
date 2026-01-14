'''  
 Time complexity : O(n ^ 2)
 Space Complexity : O(1)

 Approach :  1. Append 1 to start and end at each row
             2. Middle element = Sum of j and j-1 of previous rows
'''

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        for i in range(numRows):
            l = []
            for j in range(i+1):
                if j == 0 or j == i:
                    l.append(1)
                else:
                    l.append(result[i-1][j] + result[i-1][j-1])
            result.append(l)
        return result

