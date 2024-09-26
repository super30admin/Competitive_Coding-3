----------------------------Pascals Triangle------------------------------------------------  
# Time Complexity : O(rowIndex*2) 
# Space Complexity : O(rowIndex*2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I have used a dict to store all the previous rows of pascals triangle, 
#Here I am using dp approach where I can add the prev row same index and previous index value and add 1 in the front and back of the row.

class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        d = {1:[1]}
        for i in range(2, rowIndex+2):
            temp =[1]
            prev = d[i-1]
            for k in range(1,len(prev)):
                temp.append(prev[k]+prev[k-1])
            d[i] = temp+[1]
        return d[rowIndex+1]