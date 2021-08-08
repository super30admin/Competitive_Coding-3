class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        p_t = []
        
        p_t.append([1])
        p_t.append([1,1])
        
        if(numRows == 1):
            return [[1]]
        
        for row in range(2,numRows):
            
            elem_row = [0]*(row+1)
           
            elem_row[0] = 1
            elem_row[-1] = 1
            lengthRow = len(elem_row)
            
            for temp in range(1, lengthRow - 1):
                elem_row[temp] = p_t[row -1][temp-1] + p_t[row-1][temp]
            p_t.append(elem_row)
        return p_t