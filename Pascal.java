// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                // when first last element by default must be 1
                if(j==0 || j==i) row.add(1);
                else
                    //inbetween are from previous row, value at col-1 plus value at col
                    row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            result.add(row);
        }
        return result;
    }
}