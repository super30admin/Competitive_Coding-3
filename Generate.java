import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vishal Puri
 * // Time Complexity : O(n^2)
 * // Space Complexity : O(n^2)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        if (numRows == 1) {
            out.add(Arrays.asList(1));
            return out;
        }
        out.add(Arrays.asList(1));
        out.add(Arrays.asList(1, 1));
        if (numRows == 2)
            return out;
        for (int i = 3; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 2; j <= i - 1; j++) {
                List<Integer> li = out.get(i - 2);
                temp.add((li.get(j - 2) + li.get(j - 1)));
            }
            temp.add(1);
            out.add(temp);
        }
        return out;
    }
}
