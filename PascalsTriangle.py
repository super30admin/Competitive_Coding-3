# TC: O(N^2) where N is the numRows given in the input. 
# SC: O(N^2) since we are creating an array of avg N in each iteration repeating for avg N times.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return 
        
        final = []
        
        for i in range(numRows):
            curr_row = [0] * (i + 1)
            curr_row[0] = 1
            curr_row[-1] = 1
            
            for j in range(1, len(curr_row) - 1):
                curr_row[j] = final[i - 1][j - 1] + final[i - 1][j]
            final.append(curr_row)
        return final
        
