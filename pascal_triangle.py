"""
// Time Complexity : O(n)
// Space Complexity : O(k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
-Initialuze first row as [1]
- Iterate using the rowindex iterator
    - Append 1 at the state and beginning of intermediate results list
    - Between elements are filled using tthe above row's elements sum of previous
    2 indexes in the that row
- Return result[-1]
"""
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        """
        
        """
        if rowIndex < 0:
            return []
        results = [[1]]
        i = 1
        while i < rowIndex+1:
            l = []
            l.append(1)
            r = results[i-1]
            for j in range(len(r)-1):
                l.append(r[j]+r[j+1])
            l.append(1)
            results.append(l)
            i+=1
        return results[-1]