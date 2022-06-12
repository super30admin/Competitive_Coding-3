#Time complexity: O(n^2)
#Space complexity: O(1)
class Solution:
    def generate(self, numRows: int):
        lst=[]
        lst.append([1])
        for i in range(1,numRows):
            lst1=[]
            for j in range(0,i+1):
                res=self.binaryCoeff(i,j,lst)
                lst1.append(res)
            lst.append(lst1)
        return lst
    
    def binaryCoeff(self,n,k,lst):
        a = lst[n-1][k-1] if k-1 >= 0 and k-1 < len(lst[n-1]) else 0
        b = lst[n-1][k] if k>=0 and k<len(lst[n-1]) else 0
        return a+b