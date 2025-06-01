// time complexity - O(n^2)
// Space complexity - O(n^2)
// Did you solve on leetcode- yes
// Problems faced - no
class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1); // First element is always 1

            for (int col = 1; col < row; col++) {
                int prevRowVal = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                currentRow.add(prevRowVal);
            }

            if (row > 0) currentRow.add(1); // Last element is also 1 (except for the first row)
            triangle.add(currentRow);
        }

        return triangle;
    }
}
