'''
Time: o(n^2) , n= numRows
Space : O(1)
'''
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = [] # final answer , list of list
        if numRows>=1:
            ans.append([1]) # first row
        if numRows>=2:
            ans.append([1,1]) # second row

        for row in range(2,numRows):
            curr_row = [] 
            curr_row.append(1)
            for j in range(1,row):
                curr_row.append(ans[-1][j]+ans[-1][j-1]) # top + top-left
            curr_row.append(1)
            ans.append(curr_row)
        
        return ans