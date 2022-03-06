import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(1) as we are creating temp array lists that get
// added to result (does not increase as numRows increases)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        // ArrayList is empty
        if (numRows <= 0) {
            return result;
        }

        List<Integer> previous = new ArrayList<>();
        previous.add(1); // first element k = 1
        // adding to result
        result.add(previous);
        
        // looping from 1 to numRows - 1
        for (int i = 1; i < numRows; i++) {
            List<Integer> next = new ArrayList<>();
            // 1 always added to beginning of ArrayList
            next.add(1);
            // looping from 1 to i - 1
            for (int j = 1; j < i; j++) {
                // getting middle elements at k - 1 row
                int left = result.get(i-1).get(j-1);
                int right = result.get(i-1).get(j);
                next.add(left + right);
            }
            // 1 always added to end of ArrayList
            next.add(1);
            // adding to result
            result.add(next);
        }
        return result;
    }
}