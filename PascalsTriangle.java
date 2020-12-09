// Time Complexity : O(N^2) , N is number of rows
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    int left = result.get(i - 1).get(j - 1);
                    int right = result.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            result.add(row);
        }
        return result;
    }
}