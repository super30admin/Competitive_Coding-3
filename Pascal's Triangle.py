class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ll=[]
        for i in range(numRows):
            l=[]
            for j in range(i+1):
                if j==0 or j==i:
                    l.append(1)
                else:
                    left=ll[i-1][j-1]
                    right=ll[i-1][j]
                    l.append(left+right)
            ll.append(l)
        return ll
