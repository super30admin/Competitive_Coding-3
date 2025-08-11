import java.util.*;

public class PascalTriangle {
    /*
    Approach:
    - We use a 2D DP array `dp` where dp[row][col] stores the value at
      that position in Pascal's Triangle.
    - Base cases:
        dp[row][0] = 1  // First element in every row is 1
        dp[row][row] = 1 // Last element in every row is 1
    - For other positions:
        dp[row][col] = dp[row-1][col-1] + dp[row-1][col]
    - We loop through each row, fill the dp values, then copy the first
      (row+1) values from that row into a List<Integer> and add it to our result.
    - The result is a List of Lists representing Pascal’s Triangle.

    Time Complexity:
        O(numRows^2) → We fill each cell of the lower-left triangle of the dp array.

    Space Complexity:
        O(numRows^2) → For storing the dp table (can be reduced to O(numRows) with 1D array).

    This code was tested successfully on LeetCode.

*/
    public List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows + 1][numRows + 1];
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            dp[row][0] = 1;
            dp[row][row] = 1;

            for (int col = 1; col < row; col++) {
                dp[row][col] = dp[row - 1][col - 1] + dp[row - 1][col];
            }

            List<Integer> list = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                list.add(dp[row][col]);
            }
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalTriangle sol = new PascalTriangle();
        int numRows = 5;
        List<List<Integer>> pascal = sol.generate(numRows);

        for (List<Integer> row : pascal) {
            System.out.println(row);
        }
    }

}
