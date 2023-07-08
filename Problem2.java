// Time Complexity : O(n^2) where n = numRows
// Space Complexity : O(n^2) where n = numRows
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: The code generates Pascal's triangle up to the specified number of rows by iteratively calculating each row based on the previous row's values, resulting in a triangular structure. The triangle is stored in a list of lists, which is then returned.

import java.util.ArrayList;
import java.util.List;

class Problem2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            // Calculating the current row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // Add 1 at the beginning and end of each row
                } else {
                    List<Integer> prevRow = ans.get(i - 1);
                    int num = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(num);
                }
            }
            // Add the current row to the triangle
            ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        List<List<Integer>> pascalsTriangle = obj.generate(5);

        // Print Pascal's triangle
        for (List<Integer> row : pascalsTriangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
