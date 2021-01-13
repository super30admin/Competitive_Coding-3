'''
    Time Complexity:
        O(n^2) (where n = number of rows)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Sum the prev row's values and add them in the current row.
        Handle adding 1s to both the sides of the row separately.
'''
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows < 1:
            return []

        res = [[1]]

        for i in range(1, numRows):
            op = [1]
            prev = res[-1]

            for k in range(len(prev) - 1):
                op.append(prev[k]+prev[k+1])

            op.append(1)
            res.append(op)

        return res
