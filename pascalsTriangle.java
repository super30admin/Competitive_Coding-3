// Time Complexity :O(n^2)
// Space Complexity :O(n^2)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstrow = new ArrayList<>();
        // add the first row
        firstrow.add(1);
        // add first row to final result
        result.add(firstrow);
        // loop untill number of rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevrow = new ArrayList<>();
            // get the previous row from result
            prevrow = result.get(i - 1);
            row.add(1);
            // add the value of prevrow and insert into row
            for (int j = 1; j < prevrow.size(); j++) {
                row.add(prevrow.get(j - 1) + prevrow.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}