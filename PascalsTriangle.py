class Solution:
    def generate(self, numRows):
        ans = []
        if numRows == 0:
            ans.append([])
            return ans
        ans.append([1])
        if numRows == 1:
            return ans

        for i in range(1, numRows):
            temp = [1]
            for j in range(1, i):
                temp.append(ans[-1][j-1] + ans[-1][j])
            temp.append(1)
            ans.append(temp)
        return ans