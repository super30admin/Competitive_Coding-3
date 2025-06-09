# Time O(n^2)
# Space O(n^2)
class Solution:
    '''
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    '''
    def generate(self, numRows: int) -> List[List[int]]:
        pascal=[]
        for i in range(numRows):
            row = []
            for j in range(i+1):
                if j == 0 or j == i:
                    row.append(1)
                else:
                    row.append(pascal[i-1][j-1] + pascal[i-1][j])
            pascal.append(row)
        return pascal
