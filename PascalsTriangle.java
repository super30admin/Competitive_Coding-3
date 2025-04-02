// Time Complexity : O(n^2) -> due to nested loops
// Space Complexity : O(1) -> output is not considered in space complexity
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach - 1. If 0 rows, return an empty list. Initialize the first row as [1].
// for each subsequent row i from 1 to numRows - 1:
//   - take the previous row (i - 1).
//   - build the new row by starting with [1].
//   - for each j in range [1..previousRow.size()-1], add the sum of adjacent elements from previousRow.
//   - end with [1].
//   - add this new row to the output.
// return the output list.


import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        //base case: if numRows is 0, just return empty list
        if (numRows == 0) {
            return output;
        }

        //the first row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        output.add(firstRow);

        //create next rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = output.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            //first element in each row is always 1
            currentRow.add(1);

            //middle elements are sums of adjacent elements from the previous row
            for (int j = 1; j < prev.size(); j++) {
                currentRow.add(prev.get(j - 1) + prev.get(j));
            }

            //last element in each row is always 1
            currentRow.add(1);
            //add row to list
            output.add(currentRow);
        }
        return output;
    }

    public static void main(String[] args) {
        PascalsTriangle solver = new PascalsTriangle();

        int numRows1 = 5;
        List<List<Integer>> result1 = solver.generate(numRows1);
        System.out.println("Pascal's Triangle for " + numRows1 + " rows:");
        for (List<Integer> row : result1) {
            System.out.println(row);
        }

        int numRows2 = 1;
        List<List<Integer>> result2 = solver.generate(numRows2);
        System.out.println("\nPascal's Triangle for " + numRows2 + " row:");
        for (List<Integer> row : result2) {
            System.out.println(row);
        }
    }
}
