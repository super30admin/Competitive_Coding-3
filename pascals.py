'''
Time Complexity: O(n^2) -> numRows
Space Complexity: O(n^2)
Did this code successfully run on Leetcode : Yes
Explanation: create 2D array with the following conditions:
if current index is row is == 0 or same as the previous -> append 1 (extreme edges case)
else: take the previous row [j-1] the element and the previous row [j] th element and add them and add to the new row.
'''
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []

        for i in range(0, (numRows)):
            row = []
            for j in range(0, i + 1):
                if j == 0 or j == i:
                    row.append(1)
                else:
                    left = res[i - 1][j - 1]
                    right = res[i - 1][j]
                    row.append(left + right)

            res.append(row)
        return res