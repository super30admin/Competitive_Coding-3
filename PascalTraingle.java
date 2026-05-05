// Time Complexity :O(numRows^2)
// Space Complexity :O(1) if we don't consider the output list, otherwise O(numRows^2) for the output list
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No , a bit of confusion in the inner loop but I got it after dry run

// Your code here along with comments explaining your approach
//The first and last elements of every row are always 1
//Every middle element is the sum of the two elements directly above it from the previous row
//So, if we already know the previous row, we can build the current row easily by applying this rule.
//If it's the first or last position, add 1
//Otherwise, compute the value as:
//res[i-1][j-1] + res[i-1][j] (from the previous row)
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>(Arrays.asList(1)));

        for (int i = 1; i < numRows; i++) {

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }

            res.add(list);
        }

        return res;
    }
}