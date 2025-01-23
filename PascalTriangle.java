//TC: O(n^2)
//SC: O(1)
//approach: iteratively constructing rows, and storing last row to use in creating next row

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> previousRow = new ArrayList<Integer>();
        previousRow.add(1);
        result.add(previousRow);
        if (numRows == 1) return result;
        for (int i = 2; i < numRows + 1; i++) {
            List<Integer> currentRow = new ArrayList<Integer>();
            currentRow.add(1);
            for (int j = 1; j < i - 1; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            currentRow.add(1);
            result.add(currentRow);
            previousRow = currentRow;
        }

        return result;

    }

}
