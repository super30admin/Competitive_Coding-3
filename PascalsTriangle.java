// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Create a base case for numRows = 1; For the subsequent rows,
// add 1 in beginning and end; For the indices in the middle, compute
// them using the previous row values.

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        // base case
        res.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 1; j <= i - 1; j++) {
                current.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            current.add(1);
            res.add(current);
        }

        return res;
    }
}