# Time Complexity: O(row^2) where row is the number of rows
# Space Complexity:  O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        result.append([1])
        for _ in range(1,numRows):
            temp = []
            temp.append(1)
            for i in range(1,len(result[-1])):
                temp.append(result[-1][i] + result[-1][i-1])
            temp.append(1)
            result.append(temp)
        return result
