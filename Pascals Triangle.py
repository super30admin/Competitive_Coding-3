# Time Complexity: O(n**2)
# Space Complexity: O(1)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1], [1,1]]
        if numRows == 1:
            return [result[0]]
        if numRows == 2:
            return result
        for i in range(2, numRows):
            temp = []
            temp.append(1)
            p1 = 0
            p2 = 1
            while p2 < len(result[i-1]):
                temp.append(result[i-1][p1] + result[i-1][p2])
                p1 += 1
                p2 += 1
            temp.append(1)
            result.append(temp)
        return result