// Time Complexity : O(n2)
// Space Complexity : O(n2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach
// Used the dp approach to solve
// took the previous rows to sum to get the current row

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0)
            return null;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        n.add(1);
        result.add(n);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList();
            row.add(1);

            List<Integer> previous = result.get(i - 1);
            for (int j = 1; j < i; j++) {
                row.add(previous.get(j - 1) + previous.get(j));

            }
            row.add(1);
            result.add(row);
        }
        return result;

    }
}