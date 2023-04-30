// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * As we noticed a pattern where all left and right side numbers of triangle would be 1 and summation of previous rows it answer to next,
 * we can think of this in DP term whit left aligned triangle for intution
 * All other triangle element = prevRow-left + prevRow-right.
*/

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) {
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for(int i = 1; i < numRows; i++) {
            List<Integer> pRow = new ArrayList<>();
            pRow.add(1);
            List<Integer> prevRow = result.get(i - 1);
            for(int j = 1; j < i; j++) {
                pRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            pRow.add(1);
            result.add(pRow);
        }

        return result;
    }
}
