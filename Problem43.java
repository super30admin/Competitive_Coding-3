// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        
        for(int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j = 1; j < prevRow.size(); j++) {
                curRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            curRow.add(1);
            result.add(curRow);
        }

        return result;
    }
}
