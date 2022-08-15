// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        // TC: O(n^2)
        // SC: O(1)
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                }
                else {
                    int left = result.get(i - 1).get(j-1);
                    int right = result.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            result.add(row);
        }
        return result;
    }
}