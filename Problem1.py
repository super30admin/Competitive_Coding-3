"""
    Problem : Pascal's Triangle

    Student : Shahreen Shahjahan Psyche
    Time Complexity : O(N^2)
    Space Complexity : O(1)

"""

from typing import List

class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        
        # edge cases
        if rowIndex == 0:
            return [1]
        
        if rowIndex == 1:
            return [1, 1]
        
        # As the returning row size will be rowIndex+1, thats why initializing
        # the returning list with 1
        res = [1 for i in range(rowIndex+1)]
        
        for i in range(2, rowIndex+1):
            prev = res[0]
            for j in range(1, i):
                temp = res[j]
                res[j] = temp + prev
                prev = temp
            
        return res