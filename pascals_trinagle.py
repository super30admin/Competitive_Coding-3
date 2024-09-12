# O(N^2) time and O(N^2) space where N is no.of rows
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        out = []
        for row in range(numRows):
            current = [None for _ in range(row+1)]
            current[0],current[-1] = 1,1
            for i in range(1,len(current)-1):
                current[i] = out[row-1][i-1]+out[row-1][i]
            out.append(current)
        return out
            
        