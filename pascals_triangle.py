# O(numRows ^ 2) time and O(numRows) space
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        output = [[1]]
        previous = [1]
        for i in range(1,numRows):
            current = [None for _ in range(i+1)]
            for j in range(len(current)):
                if j == 0:
                    current[j] = previous[j]
                elif j == len(current)-1:
                    current[j] = previous[-1]
                else:
                    current[j] = previous[j-1] + previous[j]
            output.append(current[:])
            previous = current[:]
        return output