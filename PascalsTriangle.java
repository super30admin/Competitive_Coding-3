// Time Complexity : O(n^2) where n=num of rows. 
// Space Complexity : O(n^2) where n=num of rows. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                
                if(j==0 || j==i) {
                    // first and last element of every row is 1
                    row.add(1);
                }
                else {
                    // get previous row's j and j-1 elements and add them
                    int left = res.get(i-1).get(j-1);
                    int right = res.get(i-1).get(j);
                    row.add(left+right);
                }
            }
            res.add(row);
        }
        return res;
    }
}