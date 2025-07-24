# Time Complexity : It is O(n2) since we are iterating with the list twice for rows and columns.
# Space Complexity : It is O(n) since are creating the different permutation.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        
        for row in range(1,numRows):
            rowList=[]
            for col in range(row+1):
                if col==0 or col==row:
                    rowList.append(1)
                else:
                    currentDerivedVal = result[row-1][col] + result[row-1][col-1] 
                    rowList.append(currentDerivedVal) 
            result.append(rowList)       
        return result

obj = Solution()
print(obj.generate(5))