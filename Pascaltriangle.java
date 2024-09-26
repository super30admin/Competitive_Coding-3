// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else {
                    int left = res.get(i - 1).get(j - 1);
                    int right = res.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            res.add(row);
        }
        return res;
    }
}