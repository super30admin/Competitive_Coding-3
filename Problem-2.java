// Time Complexity : O(n^2)
// Space Complexity :O(n^2)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Start with the first two base rows of Pascal’s Triangle: [1] and [1, 1].
// For each new row, compute inner values by adding two adjacent numbers from the previous row.
// Append 1 at the start and end of each row to complete it, and repeat until all rows are built.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }

        if (numRows == 2) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1, 1));
            return result;
        }

        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(1));
        output.add(Arrays.asList(1, 1));

        for (int i = 2; i < numRows; i++) {
            List<Integer> prev = output.get(output.size() - 1);
            List<Integer> newRow = buildRow(prev, i);
            output.add(newRow);
        }

        return output;
    }

    // Helper method similar to your Python res_row()
    private List<Integer> buildRow(List<Integer> prev, int i) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int k = 1; k < i; k++) {
            row.add(prev.get(k - 1) + prev.get(k));
        }

        row.add(1);
        return row;
    }
}
