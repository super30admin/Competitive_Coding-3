# Time Complexity : O(n^2)
# Space Complexity : O(n^2)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Problem Name: Pascal's Triangle

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        result = [[1]]
        for i in range(1, numRows):
            arr = [1] * (i+1)
            for j in range(1, i):
                arr[j] = result[i-1][j] + result[i-1][j-1]
            result.append(arr)
        return result