class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        self.ans = []
        matrix = [["." for _ in range(n)] for _ in range(n)]
        self.helper(0,n,matrix)
        print(self.ans)
        
    def check(self,i,j,matrix):
        
        r = i
        c = j
        m = len(matrix)
        n = len(matrix[0])
        while(r>-1 and r<m and c>-1 and c<n):
            if(matrix[r][c]=="Q"):
                return False
            
            r+=1
        r = i
        c = j
        while(r>-1 and r<m and c>-1 and c<n):
            if(matrix[r][c]=="Q"):
                return False
            
            r+=1
            c+=1
        r = i
        c = j 
        while(r>-1 and r<m and c>-1 and c<n):
            if(matrix[r][c]=="Q"):
                return False
            
            c+=1
        r = i
        c = j
        while(r>-1 and r<m and c>-1 and c<n):
            if(matrix[r][c]=="Q"):
                return False
            r-=1
            c-=1
    
        r = i
        c = j
        while(r>-1 and r<m and c>-1 and c<n):
            if(matrix[r][c]=="Q"):
                return False
            r-=1
            
            
        r = i
        c = j
        while(r>-1 and r<m and c>-1 and c<n):
            if(matrix[r][c]=="Q"):
                return False
            c-=1
        return True
    def helper(self,curr,n,matrix):
        if(curr==n):
            print(matrix)
            self.ans.append(matrix.copy())
            return 
        
        for j in range(n):
            if(self.check(curr,j,matrix)):
                matrix[curr][j] = "Q"
                self.helper(curr+1,n,matrix)
                matrix[curr][j] = "."
                    