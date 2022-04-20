class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        PT = []
        PT.append([1])
        if numRows==1: return PT 
        PT.append([1,1])
        if numRows ==2: return PT 
        
        prev_row = [1,1]
        for r in range(2, numRows): # numrows 
            curr_row = [1] * (r+1)
            for ind in range(1, r): # numrows 
                curr_row[ind] = prev_row[ind] + prev_row[ind-1]
                curr_row[r-ind] = curr_row[ind]
            PT.append(curr_row)
            prev_row = curr_row
        return PT 
    
