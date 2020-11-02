// Pascal triangle
//approach - Create list of list as result, fill first and last row as 1.
// For middle element we need to add element from row-1, col & row-1, col-1
//Time - O(numRows^2)
// Space - O(1)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> rowValues = new ArrayList<>();
            for (int col = 0; col < row + 1; col++) { // 1,0
                if (row == col || col == 0) {
                    // First and last row = 1
                    rowValues.add(1);
                } else {
                    // addition
                    rowValues.add(result.get(row - 1).get(col) + result.get(row - 1).get(col - 1));
                }

            }
            result.add(rowValues);
        }
        return result;
    }
}