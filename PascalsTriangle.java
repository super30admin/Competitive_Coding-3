// Time Complexity: O(N^2)
// Space Complexity: O(1)
// Runs on LeetCode: YES
import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    row.add(1);
                } else if (j == i) {
                    row.add(1);
                } else if (j > 0) {
                    row.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
                }
            }
            result.add(row);
        }
        return result;
    }
}