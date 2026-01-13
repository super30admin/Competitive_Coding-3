// Time Complexity : O(NXN), where N is number of rows
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// One approach is we can add 1 to beginning and ending of each row to avoid going beyond the boundaries.
// Second approach check if i/j is beyond boundary, dont fetch them just use 0 and add it to [i-1],[j] value.

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        // create first row
        result.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < numRows; j++) {
                int top = 0;
                // Check if [i-1][j] value exist by comparing j and size of previous row. Else use 0.
                if (j < result.get(i-1).size()) {
                    top = result.get(i - 1).get(j);
                }
                int topLeft = 0;
                // Check if [i-1][j-1] value exists, this will fail when j is at the boundary, j==0. Else use 0.
                if (j > 0) {
                    topLeft = result.get(i - 1).get(j - 1);
                }
                temp.add(top + topLeft);
                // As soon as required number of elements are processes break. 
                if(j == i){
                    break;
                }
            }
            result.add(temp);
        }

        return result;
    }
}
