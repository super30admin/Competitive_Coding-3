"""
Author: Srinidhi Bhat
Time Complexity: O(no_of_row^2)
Space Complexity: O(no_of_rows^2)

Did it run on LC: Yes
Logic: Excepet for first and last element every elelemt is obtained by addition
of elements in same column previous row and previous column, previous row
hence using DP, we can obtain the current element. 
"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = []
        
        for row in range(numRows):
            curr_row = [0 for _ in range(row+1)]
            
            curr_row[0],curr_row[len(curr_row)-1] = 1,1
            
            for i in range(1,len(curr_row)-1):
                curr_row[i] = ans[row-1][i-1] + ans[row-1][i]
            ans.append(curr_row)
        return ans