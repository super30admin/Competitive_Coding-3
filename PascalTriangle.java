
import java.util.*;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // First and last elements are always 1
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Current value = two values directly above
                    row.add(result.get(i - 1).get(j - 1)
                            + result.get(i - 1).get(j));
                }
            }

            result.add(row);
        }

        return result;
    }
}

// **Approach:**

// 1. Build the triangle row by row; the first and last elements of every row are 1.
// 2. Every middle element is calculated by adding the two elements directly above it from the previous row.
// 3. Store each completed row in result and return the entire triangle.

// **Time Complexity:** `O(numRows²)`
// **Space Complexity:** `O(numRows²)` — required to store the output.

