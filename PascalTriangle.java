// Time Complexity : O(n ^ 2) because we use the outer loop to maintain the rows, the inner loop to add the values to the row
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
//Approach: run two nested for loops, outer one to maintain the rows 1, 11, 121, 1331, 14641 etc
//inner loop to add the sentinel and non-sentinel values to the row using the prev row and adding the integers at j - 1 and j position from the prev row
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            final List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) row.add(1);
                else {
                    row.add(output.get(i - 1).get(j - 1) + output.get(i - 1).get(j));
                }
            }

            output.add(row);
        }

        return output;
    }

    public static void main(String[] args) {
        final PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generate(5));
    }
}
