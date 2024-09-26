# time complexity is o(n²), where n is the size of the input
# space complexity is o(1)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = list()
        if (numRows < 1):
            return res
        res = [[1], [1,1]]
        if(numRows ==1):
            return [res[0]]
        if(numRows == 2):
            return res
        
        for i in range(2, numRows):
            res.append([1,1])
            for k in range(0,i):
                if( k+1 < i):
                    res[i].insert(k+1, res[i-1][k] + res[i-1][k+1])
        return res