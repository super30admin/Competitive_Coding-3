import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Pascal Triangle:
// We create a dp table of n x n 
// Building dp table from row 0  to n - 1
// Current value will be sum of top two elements
class Solution2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0)
            return result;

        for (int row = 0; row < numRows; row++) {
            List<Integer> rowItems = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    // Handling 1st 2 rows and subsequent first and last elemnt of row
                    rowItems.add(1);
                } else {
                    int newValue = result.get(row - 1).get(col - 1) + result.get(row - 1).get(col);
                    rowItems.add(newValue);
                }
            }
            result.add(rowItems);
        }
        return result;
    }
}