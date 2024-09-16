#Time Complexity : O(ROW*ROW)
#Space Complexity : O(N)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO

import math
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        li = [[1]]
        li2 = []
        for i in range(1,numRows):
            for j in range(0,i+1):
                if j == 0 or j == i:
                    li2.append(1)
                    continue
                summ = li[i-1][j] + li[i-1][j-1]
                li2.append(summ)
                    
            li.append(li2)
            li2 = []
            
        return li
                    

            