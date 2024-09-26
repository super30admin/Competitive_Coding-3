'''
Time Complexity -->
O(n*n)

Space Complexity -->
O(n*n)

'''
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        
        for i in range(numRows):
            ls = []
            for j in range(i+1):
                if j==0 or j==i:
                    ls.append(1)
                else:
                    ls.append(res[i-1][j-1]+res[i-1][j])
            res.append(ls)
        print(res)
        return res
        
        