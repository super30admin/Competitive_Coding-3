# Leetcode problem link : https://leetcode.com/problems/pascals-triangle-ii/
# Time Complexity : O(n*2)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(2^n) => Create a recursive tree to get compute value for an index by getting values from previous row same column and column before that. 

        Optimized approach: O( n^2 ) => 1. Create a 1-d array of size rowIndex with all 1s populated
        2. Start from the second row as the first two rows will have only 1s.
        3. Start from the second last column (as last value is pre-populated as 1) in second row and compute value by getting previous row same column and previous row previous column.
        4. Keep doing till 1st column for ith row.
        5. Return the response
        
'''
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        # edge case
        if not rowIndex:
            return [1]
        # 1
        curr = [1] * (rowIndex+1)
        # 2
        for i in range(2,rowIndex+1):
            # 3
            for j in range(i-1,0,-1):
                curr[j]+=curr[j-1]
        # 5
        return curr
                
            