#Time Complexity O(N^2) One pass for traversing numRows rows and numRows columns
#Space Complexity O(1)
#It successfully runs on the leetcode


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res= [[1]]
        for i in range(1,numRows):
            row=[]
            for j in range(i+1):
                if j==0 or j==i:
                    row.append(1)
                else:   
                    row.append(res[i-1][j] + res[i-1][j-1])
            res.append(row)
        return res
        