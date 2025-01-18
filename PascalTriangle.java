// Approach: Create a matrix with given no.of rows (n) and nth odd number of columns. Initialize the first row with all 0s, except for the
// middle element, which should be set to 1. Then, fill the remaining matrix elements, where each element is computed as the sum of the
// elements immediately diagonally above the current element. Finally, print the matrix without the 0s.
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Arrays;

public class PascalTriangle {

    void print(int rows) {
        // find nth odd number to determine # cols
        int cols = 2 * rows - 1;
        int[][] matrix = new int[rows][cols];
        Arrays.fill(matrix[0], 0);
        matrix[0][cols / 2] = 1;

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == 0) {
                    matrix[i][j] = matrix[i - 1][j + 1];
                } else if (j == cols - 1) {
                    matrix[i][j] = matrix[i - 1][j - 1];
                } else {
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j + 1];
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        int numRows = 5;
        pt.print(numRows);
    }
}
//         1
//       1 0 1
//     1 0 2 0 1
//   1 0 3 0 3 0 1
// 1 0 4 0 6 0 4 0 1