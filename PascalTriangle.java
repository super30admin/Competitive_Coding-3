// Complexity:
// Time: O(numsRows^2)
// Space: O(numsRows)

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> prev = new ArrayList<>();

        for (int index = 0; index < numRows; index++) {
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int col = 1; col <= index; col++) {
                if (index == col)
                    row.add(1);
                else
                    row.add(prev.get(col) + prev.get(col - 1));
            }

            result.add(row);

            prev = List.copyOf(row);
        }

        return result;
    }
}
