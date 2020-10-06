class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        arr = []
        arr.extend([1])
        for line in range(1, numRows + 1):  
            C = 1
            for i in range(1, line + 1):    
                C = int(C * (line - i) / i);
                if (line == numRows) and (i != numRows):
                    print(line,i)
                    arr.extend([C])
        return arr
                   
