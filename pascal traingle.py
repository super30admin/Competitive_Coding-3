#Time: O(n*n) Space: (1)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ll=[[1],[1,1]]
        if numRows==1:
            return [[1]]
        if numRows==2:
            return ll
        for i in range(2,numRows):
            ll.append([1])
            
            for j in range(0,len(ll[i-1])-1):
                ll[i].append(ll[i-1][j]+ll[i-1][j+1])
            ll[i].append(1)
        return ll
