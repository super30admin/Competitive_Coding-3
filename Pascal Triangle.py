#Time Complexity: O(n*2)
#Space Complexity: O(n*2)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1]]
        for i in range(1,numRows):
            lst = []
            lst.append(1)
            for j in range(1,i):
                lst.append(res[i-1][j-1] + res[i-1][j])
            lst.append(1)
            res.append(lst)
        return res