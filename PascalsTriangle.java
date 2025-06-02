import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    /**
     * DP solution to calculate current row elements based on last row values.
     * Time: O(n^2) Space: O(1)
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> previous = result.get(i - 1);
            List<Integer> current = new ArrayList<>();
            int count = 0;

            while (count < previous.size() + 1) {
                int sum = 0;
                if (count - 1 >= 0) {
                    sum += previous.get(count - 1);
                }
                if (count < previous.size()) {
                    sum += previous.get(count);
                }
                current.add(sum);
                count++;
            }
            result.add(current);
        }
        return result;
    }
}
