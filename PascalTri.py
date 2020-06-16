"""
// Time Complexity : mentioned along code
// Space Complexity : mentioned along code
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""

class Solution:
    """
    RECURSIVE
    Time complexity : o(n^2)
    Space complexity : o(k)  
    """
    """

    def helper(self, prev, cur_ind, k):
        
        
        cur_row = [0 for _ in range(cur_ind)] #initializing current row
        
        cur_row[0] = 1 #placing 1's at 0th and last index of the row
        cur_row[-1] = 1
        
        for j in range(1, len(cur_row)-1): #filling up the remaining cells
            cur_row[j] = prev[j-1] + prev[j]
        
        #prev = cur_row
        #cur_ind +=1
        if cur_ind == k+1: base case
            return cur_row
         
        return self.helper( cur_row, cur_ind+1, k)
        """
        
    
    def getRow(self, rowIndex: int) -> List[int]:
        """
        ITERATIVE
        Time complexity : o(n^2), n -> number of rows
        Space complexity : o(k)
        """

        prev = [] #keeps track of previous row
        
        for i in range(rowIndex+ 1):
            cur = [0 for _ in range (i+1)] #initializing the current row 
            
            cur[0],cur[-1] = 1,1 #placing 1's at 0th and last index of the row
            
            for k in range(1,len(cur)-1): #filling up the remaining cells
                
                cur[k] = prev[k-1] + prev[k]
                
            prev = cur   #updating prev
        return cur
        """
        return self.helper([1],1, rowIndex)
        """