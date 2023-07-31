// Time Complexity : O(numRows^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * 1. Initialize the first row with 1.
 * 2. Compute the current list from previous list.
 * 3. After computing add the list to result.
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<1; i++){
            list.add(1);
            result.add(new ArrayList<>(list));
        }

        for(int row=1; row<numRows; row++){
            List<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = result.get(row-1);

            currRow.add(1);
            for(int col=1; col<row; col++){
                currRow.add(prevRow.get(col-1) + prevRow.get(col));
            }
            currRow.add(1);
            result.add(new ArrayList<>(currRow));
        }

        return result;
    }
}