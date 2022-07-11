class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        l=[]
        for k in range(1,numRows+1):
            
            p=[0 for _ in range(k)]

            for i in range(k):
                if i==0 or i==k-1:
                    p[i]=1
                else:
                    p[i]=l[k-2][i]+l[k-2][i-1]

            l.append(p)
                
        return l
                
                
        
        
        