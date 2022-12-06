#Time: O(n)
#Space: O(1)
#Problem ran on leetcode successsfully

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        lenRow = 1
        res = []
        for i in range(numRows):
            currRow = [0] * lenRow
            for j in range(lenRow):
                if j == 0:
                    currRow[j] = 1
                elif j == len(currRow) - 1:
                    currRow[j] = 1
                else:
                    currRow[j] = res[lenRow-2][j-1] + res[lenRow-2][j]
            
            lenRow += 1
            res.append(currRow)
        
        return res
                    
            
        