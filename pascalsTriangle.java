// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

/*
 * Approach
 * We know that in a pascal's triangle, apart from the first and last elements
 * of each row, each element is the sum of the previous 2 "parent" elements.
 * Considering current row and column is i and j, the sum is i-1,j-1 and i-1,j
 * if we consider a 2D matrix for pascal's triangle of the following form:
 *
 * Pascal's Triangle:
 *
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 *
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>();
        r.add(Arrays.asList(1)); // first row
        if(numRows == 1) {
            return r;
        }
        r.add(Arrays.asList(1,1)); // second row

        // remaining rows
        for(int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = r.get(i-1);
            row.add(1); // starting 1
            for(int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1); // ending 1
            r.add(row);
        }
        return r;
    }
}