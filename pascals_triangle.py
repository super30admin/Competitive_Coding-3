'''
118 Pascal's Triangle
https://leetcode.com/problems/pascals-triangle/description/

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
            1
         1  2  1
       1  3   3   1
      1  4   6   4   1


Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]

Solution:
1. The key observation is that for any row indexed by i, the first and last columns of row i are always set to 1.
    A[i][0] = A[i][i] = 1

The in-between columns (col !=0 and col != i) are filled using the previous row's current and prev column as:
    A[i][j] = A[i-1][j-1] + A[i-1][j]

Time: O(N^2), Space: O(1)
'''
def generate_pascal_triangle(N):
    if N == 0:
        return []
    nums = [[1], [1,1]]
    if N == 1 or N == 2:
        return nums[0:N]

    for i in range(2, N):
        nums.append([-1]*(i+1))
        nums[i][0] = 1
        for j in range(1, i):
            nums[i][j] = nums[i-1][j-1] + nums[i-1][j]
        nums[i][i] = 1

    return nums


def run_tests():
    tests = [ (0, []),
              (1, [[1]]),
              (2, [[1], [1,1]]),
              (3, [[1], [1, 1], [1, 2, 1]]),
              (4, [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]),
              (5, [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]),
              (6, [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1], [1, 5, 10, 10, 5, 1]]),
              (7,  [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1], [1, 5, 10, 10, 5, 1], [1, 6, 15, 20, 15, 6, 1]]),
    ]
    for test in tests:
        N, ans = test[0], test[1]
        res = generate_pascal_triangle(N)
        print(f"\nN = {N}")
        print(f"Pascal's Triangle = {res}")
        passed = (ans == res)
        assert passed == True, f"Test case failed"
        print(f"Pass: {passed}")


run_tests()
