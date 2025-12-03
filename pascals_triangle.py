# https://leetcode.com/problems/pascals-triangle/description/

class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        # creating the first of the triangle which is always 1. It's list inside a list
        first_row = [[1]]
        # as first row is already made above so we need to made remaining rows
        for i in range(numRows -1):
            # creating new temp list
            # we are taking 0 for our understanding to build the next row
            temp = [0] +    first_row[-1] + [0]
            # creating an empty row for the next for loop
            row = []
            # building the next row and it's length would be the previous row+1
            for j in range(len(first_row[-1]) + 1):
                # apending the row
                row.append(temp[j] + temp[j + 1])
            first_row.append(row)
        return(first_row)

solution = Solution()
print(solution.generate(5))