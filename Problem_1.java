// Time Complexity : O(numOfRows^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We notice that values of inner current row and dependent on previous row's j - 1 and j. So we create the list
   at current row using the previous row's values and push it to 2d list. The first row is always 1 so we add that.
   Similarly for each row, the first and last values are also set to 1. In the end the 2d list is returned.
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result  = new ArrayList<List<Integer>>();

        result.add(new ArrayList<>());
        result.get(0).add(1);

        for(int i = 1; i < numRows; ++i) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> newRow = new ArrayList<Integer>();

            newRow.add(1);
            for(int j = 1; j < i; ++j) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
}