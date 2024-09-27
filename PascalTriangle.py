# Time Complexity - O(N)

# Space Complexity - O(N) - for recursive stack

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding this : No

# Approach
# I have used a recursive approach.

class Solution:

    def pascal(self, numRows):
        if numRows == 0:
            return []

        elif numRows == 1:
            return [[1]]

        elif numRows == 2:
            return [[1], [1, 1]]

        else:
            result = self.pascal(numRows - 1)
            temp = [1]
            for j in range(1, len(result[-1])):
                sum = result[-1][j - 1] + result[-1][j]
                temp.append(sum)
            temp.append(1)
            result.append(temp)
            return result

    def generate(self, numRows: int) -> List[List[int]]:
        return self.pascal(numRows)








