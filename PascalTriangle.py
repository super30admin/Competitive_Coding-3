class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        # TC: O(n**2)
        # SC: O(n**2)
        if numRows == 0:
            return []
        res = [[1]]
        if numRows == 1:
            return res

        for _ in range(numRows - 1):
            dummy_row = [0] + res[-1] + [0]
            row = []

            for i in range(len(res[-1]) + 1):
                row.append(dummy_row[i] + dummy_row[i+1])
            res.append(row)
        
        return res