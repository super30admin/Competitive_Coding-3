# Time Complexity : O(k)
# Space Complexity : O(k)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        if 0 == rowIndex:
            return [1]
        prev = [1]
        
        for i in range(1, rowIndex+2):
            curr = []
            for j in range(i):
                if 0 == j or i-1 == j: # add 1 to list if it is the first or last element of the row 
                    curr.append(1)
                else:
                    curr.append(prev[j-1]+prev[j]) # get the value from previous row
            prev = curr # only the previous row is required to generate the next row    
        return curr