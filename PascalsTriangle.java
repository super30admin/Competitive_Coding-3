// Time Complexity : O ( n^2 )
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.List;

// Your code here along with comments explaining your approach
class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        // add first row with just '1'
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 2; i <= numRows; i++) {
            result.add(new ArrayList<>());
            for (int j = 1; j <= i; j++) {
                // edges of the row are always 1
                if(j == 1 || j == i) {
                    result.get(i - 1).add(1);
                    continue;
                }
                // F(i, j) = F(i - 1, j - 1) + F(i - 1, j)
                // (0 based indexing)
                int value = result.get(i - 2).get(j - 2) + result.get(i - 2).get(j - 1);
                result.get(i - 1).add(value);
            }
        }
        return result;
    }
}