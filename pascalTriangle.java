/*
TC --> O(n*m)
SC --> O(1)
 */
import java.util.*;

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        if (numRows == 1) {
            return res;
        } else {
            res.add(Arrays.asList(1, 1)); // if rows are 2
            int i = 2;
            while (i < numRows) {
                List<Integer> ls = new ArrayList<>();
                int j = 0;
                while (j <= i) {
                    if (j == 0 || j == i) {
                        ls.add(1);
                    } else {
                        int sum_val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                        ls.add(sum_val);
                    }
                    j++;
                }//while

                res.add(ls);
                i++;

            }//while

        }//else

        return res;

    }
}
