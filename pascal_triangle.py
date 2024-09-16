class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        '''
        Time Complexity: O(n^2)
        Space Complexity: O(n^2) if output array is included, else O(1)
        '''
        if(numRows<=0):
            return []
        r = [[1]]
        for i in range(1,numRows):
            r.append([])
            for j in range(0,i+1):
                if(j==0 or j==i):
                    r[-1].append(1)
                else:
                    # dp
                    r[-1].append(r[-2][j-1] + r[-2][j])
        return r
