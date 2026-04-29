class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        # time O(n^2), space O(1)
        res = []
        for i in range(1,numRows+1):
            row = [1]*i
            # always start at first 2 positions of prev row
            l=0
            r=1
            if i > 2:
                prevRow = res[-1]
                p = 1
                while r < len(prevRow):
                    row[p] = prevRow[l]+prevRow[r] 
                    p+=1
                    l+=1
                    r+=1
            res.append(row)
    
        return res