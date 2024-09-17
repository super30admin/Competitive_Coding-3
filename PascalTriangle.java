// Time Complexity : O(N^2)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();

        for(int i=0;i<numRows;i++) {

            // add 1 as initial element
            row.add(0, 1);

            // calculate sum for elements within 1 and last element
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));

            res.add(new ArrayList<Integer>(row));
        }
        return res;

    }
}