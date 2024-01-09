#Time Complexity: O(n^2)
#Space complexity: O(n^2)

class Solution:
    def generate(self, numRows: int) -> list[list[int]]:

        result = [[1]] #Initializing the first row 
        if numRows == 1:
            return result
        for i in range (numRows - 1):  # 1 to n
            temp = [0] + result[-1] + [0] #1, 1
            row = []
            for j in range (len(result [-1]) + 1):
                row.append(temp[j] + temp[j + 1])
            result.append(row)
        return result



     
        