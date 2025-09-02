//Time Complexity: O(numRows^2)
//Space Complexity: O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/**
 * The first row is added using the result.add(Arrays.asList(1));
 * For each subsequent row, we start and end with 1. The curr.add(1) before the inner for loop adds the starting 1, and the curr.add(1) after the inner for loop adds the ending 1.
 * The inner for loop calculates the intermediate values by summing the two values directly above it from the previous row.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class pascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        
        for(int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j = 1; j < prevRow.size(); j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currRow.add(1);
            result.add(currRow);
        }

        return result;
    }
}