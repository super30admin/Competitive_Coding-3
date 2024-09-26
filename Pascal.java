
// Time Complexity : O(N ^ 2)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach
//1. the elements have a value of 1 when they are in the border area.
//2. The rest of the elements add upto the previous row's neighboring elements

import java.util.*;

public class Pascal {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    rows.add(1);
                else {
                    int l = result.get(i - 1).get(j - 1);
                    int r = result.get(i - 1).get(j);
                    rows.add(l + r);
                }

            }
            result.add(rows);
        }

        return result;

    }

    public static void main(String args[]) {
        Pascal obj = new Pascal();

        System.out.println(obj.generate(5));

    }
}