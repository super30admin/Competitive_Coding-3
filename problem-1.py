# TC - O(n*m), where n is the rows and m is iterations per row
# SC - O(1), no additional space used


# Approach

# for the base case return [1]
# consider adding one zero in the beginning and one at the end of each row to generate the next row
# for ex, 1 can be treated as 0 1 0, which can be used to generate 1 1

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        baseCase = [[1]]

        if numRows == 0:
            return baseCase

        for i in range(1, numRows):

            sumArr = [0] + baseCase[-1] + [0]
            temp = []

            for j in range(len(baseCase)+1):
                sumEle = sumArr[j]+sumArr[j+1]
                temp.append(sumEle)

            baseCase.append(temp)

        return baseCase
