import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII_LC119 {

    /**
     * First pascal row is always [1]. Keep it hardcoded. Loop for 1 to rowIndex, use row's prev elements to find
     * intermediate elements in current row. Add 1 in the end for a row
     *
     * Time Complexity O(N^2) where n is number of rows
     * Space Complexity: O(N) only one list of size n is used
     *
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();  // output row

        if (rowIndex < 0)                      // Handle invalid input
            return row;

        row.add(1);                             // First element is always 1

        for (int i = 1; i < rowIndex + 1; i++) {    // Calculate each row upto rowIndex
            for (int j = i - 1; j > 0; j--) {       // Middle elements computation using row's prev values
                row.set(j, row.get(j - 1) + row.get(j));
            }
            row.add(1);                         // Add last element 1
        }
        return row;
    }
}
