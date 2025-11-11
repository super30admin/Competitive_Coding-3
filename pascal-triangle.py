class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        '''1 
        1 1
        1, 2, 1
        1, 3, 3, 1
        1, 4, 6, 4, 1
        1, 5, 10, 10, 5, 1

        1, ...sum of each 2 .., 1'''

        first_two = {1: [[1]], 2:[[1], [1, 1]]}

        if numRows < 3:
            return first_two[numRows]

        result = [[1], [1, 1]]
        for i in range(2, numRows):
            temp = [1]
            for j in range(len(result[i-1])-1):
                temp.append(result[i-1][j] + result[i-1][j+1])
            temp.append(1)
            result.append(temp)
        return result

