'''
-- Passed test cases on LeetCode
'''
class Solution:
    #O(n *n) - Time complexity ; O(n) - Space complexity
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 1:
            return [[1]]
        else:
            res = []
            FirstRow = [1]
            SecondRow = [1, 1]
            res.append(FirstRow)
            res.append(SecondRow)
            currentRow = [1, 1]

        
            for i in range(2, numRows):
                presentRow = [1]
                for j in range(0, i-1):
                    presentRow.append(currentRow[j] + currentRow[j+1])
                presentRow.append(1)
                currentRow = presentRow
                res.append(currentRow)
            return res
        
        
                
        