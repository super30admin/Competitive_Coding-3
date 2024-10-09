# time complexity: O(n)
# space complexity: O(n)

# https://leetcode.com/problems/pascals-triangle/description/

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]

        if numRows==1:
            return result

        for i in range(numRows-1):
            temp = [0]+result[-1]+[0]
            newRow = []
            for j in range(len(temp)-1):
                newRow.append(temp[j]+temp[j+1])
            result.append(newRow)

        return result