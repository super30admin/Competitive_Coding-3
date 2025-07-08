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

        A = [[0]*(i+1) for i in range(N)]

        for i in range(N):
            for j in range(i+1):
                if j == 0 or j == i:
                    A[i][j] = 1
                else:
                    A[i][j] = A[i-1][j-1] + A[i-1][j]
        return A

def run_generate_pascal_triangle():
    for N in range(8):
        pt = generate_pascal_triangle(N)
        print(f"\nN = {N}")
        print(f"Pascal's Triangle: {pt}")

run_generate_pascal_triangle()
