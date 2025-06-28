"""
TC -> O(n^2)
SC -> O(n^2)

"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1]]
        if numRows == 1:
            return res
        else:
            for _ in range(1,numRows):
                temp = [0]+res[-1]+[0] #pad with 0 at first and last position. This will make it the same size as next level in Pascal triangle
                res1 = []
                r=1
                while(r<len(temp)):
                    res1.append(temp[r-1]+temp[r])
                    r+=1
                res.append(res1)
        return res