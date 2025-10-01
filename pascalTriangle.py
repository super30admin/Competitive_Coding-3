#Time Complexity: O(numRows²)
#Space Complexity: O(numRows²)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        result = []

        for row_num in range(numRows):
            row = [1]

            if result:
                rec_row = result[-1]
                for i in range(1,row_num):
                    row.append(rec_row[i-1] + rec_row[i])
                row.append(1)
            result.append(row)
        return result
