from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        # Approach 1
        # result = [[1] * i for i in range(1, numRows + 1)]
        # for i in range(2, len(result)):
        #     for j in range(1, i):
        #         result[i][j] = result[i - 1][j - 1] + result[i - 1][j]
        # return result

        # Approach 2
        """
          // Time Complexity :  O(n^2)
                            'n' is the number of rows
          // Space Complexity : O(n^2)
          // Did this code successfully run on Leetcode : Yes
        """
        result = []

        # edge case
        if not numRows:
            return result

        for row in range(0, numRows):
            cur = []
            for col in range(0, row + 1):
                if col == 0 or col == row:
                    cur.append(1)
                else:
                    cur.append(result[row - 1][col - 1] + result[row - 1][col])
            result.append(cur)
        return result


if __name__ == '__main__':
    h = Solution()
    print(h.generate(5))
    print(h.generate(0))
    print(h.generate(-5))
    print(h.generate(1))
