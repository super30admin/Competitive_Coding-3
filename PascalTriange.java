// Time Complexity : O(n^2) where n is the numRows
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
I first stored the initial array of [[1]] in the result.
I then started from row = 1 and then used the formula res[i-1][j-1] + res[i-1][j] to calculate the remaining columns.
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriange {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(Arrays.asList(1)));

        for(int i = 1;i<numRows;i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(temp);
        }

        return res;
    }
}
