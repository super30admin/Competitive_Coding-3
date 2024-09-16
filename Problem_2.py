"""
Pascal tree implementation with running array
TC - O(n^2)
SC - O(1)

"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0: return 0
        if numRows == 1: return [[1]]
        ans = [[1]]
        for i in range(numRows - 1):
            temp = [1]
            midarr = ans[-1]
            for i in range(1, len(midarr)):
                s = midarr[i - 1] + midarr[i]
                temp.append(s)
            temp.append(1)
            ans.append(temp)
        return ans

