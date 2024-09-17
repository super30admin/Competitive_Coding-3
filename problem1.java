// Problem - https://leetcode.com/problems/pascals-triangle/description/

// Time Complexity : O(n ^ 2)
// Space Complexity : O(n ^ 2)
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : Nothing as such

public class problem1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0)
            return triangle;

        List<Integer> first_row = new ArrayList<>();

        first_row.add(1);
        triangle.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }

            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
