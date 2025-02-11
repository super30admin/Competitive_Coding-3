class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ret = [[1]]

        for i in range(1, numRows):
            cur = [1]
            for j in range(1, len(ret[-1])):
                cur.append(ret[-1][j-1] + ret[-1][j])
            cur.append(1)
            ret.append(cur)
        
        return ret

# TC: O(numRows)
# SC: O(1)