
// Running 2 loops, for each row value is the sum of values in previous row, same column and previous row, column-1. For all rows, 
// first and last element will be same i.e. 1, so we can add it directly.

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Since they are expecting list<list<Integer>> as result, declare it to store
        // output
        List<List<Integer>> result = new ArrayList<>();
        // First row will be same having value 1, so declare it
        List<Integer> firstRow = new ArrayList<>();
        // Add 1
        firstRow.add(1);
        // Add first row to result
        result.add(firstRow);
        // Start a loop from 1 to numRows
        for (int i = 1; i < numRows; i++) {
            // Get the previous row
            List<Integer> prev = result.get(i - 1);
            // Declare new arraylist for current row
            List<Integer> curr = new ArrayList<>();
            // Add first value as 1 to it
            curr.add(1);
            // Run a inner loop for current row
            for (int j = 1; j < i; j++) {
                // Add the sum of prev row, same col and prev row, col-1
                curr.add(prev.get(j) + prev.get(j - 1));
            }
            // Add 1 for the last value
            curr.add(1);
            // Add current row to the result
            result.add(curr);
        }
        // Return result containing all the rows
        return result;
    }
}