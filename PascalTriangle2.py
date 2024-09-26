# Time Complexity : O(N^2)
# Space Complexity : O(rowIndex)
# Did this code successfully run on Leetcode : 
# Any problem you faced while coding this :

class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        
        result = [1] * (rowIndex + 1)
        
        for i in range(rowIndex + 1):
            for j in range(i, -1, -1):
                if j != 0 and j != i:
                    result[j] += result[j - 1]
        
        return result
        
'''
1
1 1
1 2 1
1 3 3 1

the curr depends on what is above it and diagonally up to left of it.
hence iterate revers and update curr in each ith iteration.
'''