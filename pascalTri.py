Time Complexity: O(n^2)
Space Complexity: O(m); m is size of temp list
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:\
        
        res = [[1]]
        
        for i in range(1, numRows):
            temp = list()
            for j in range(0, i+1):
                if j == 0 or j == i:
                    temp.append(1)
                else:
                    temp.append(res[i-1][j]+res[i-1][j-1])
            res.append(temp)
        
        return res
        
