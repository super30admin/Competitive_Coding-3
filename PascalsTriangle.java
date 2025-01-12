import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    /**
     Time Complexity: O(numRows*numRows)
     Space Complexity: O(1)

     Approach:
     Initialize Base Cases:
     The result list is initialized as an empty ArrayList.
     The first two rows of Pascal's Triangle ([1] and [1, 1]) are added to result.

     Handle Small Cases:

     If numRows is 1, remove the second row ([1, 1]) and return only the first row.
     If numRows is 2, return the already initialized result.
     Iterative Construction for Remaining Rows:

     For i from 2 to numRows - 1:
     Create a new currentRow to store the elements of the current row.
     Add 1 as the first and last elements of the row.
     For the intermediate elements, calculate each as the sum of two elements
     from the previous row (previousRow.get(j - 1) and previousRow.get(j)).
     Append currentRow to result.

     Return the Result:
     After constructing all rows, return the result list containing Pascal's Triangle.
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(List.of(1)));
        result.add(new ArrayList<>(Arrays.asList(1, 1)));

        if (numRows == 1) {
            result.remove(1);
            return result;
        }

        if (numRows == 2) {
            return result;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    List<Integer> previousRow =result.get(i-1);
                    currentRow.add(
                            previousRow.get(j - 1) + previousRow.get(j));
                }
            }
            result.add(currentRow);
        }
        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle obj = new PascalsTriangle();
        List<List<Integer>> generate = obj.generate(10);
        System.out.println("Result: " + generate);
        List<List<Integer>> expected = new ArrayList<>(Arrays.asList(
                List.of(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1),
                Arrays.asList(1, 5, 10, 10, 5, 1),
                Arrays.asList(1, 6, 15, 20, 15, 6, 1),
                Arrays.asList(1, 7, 21, 35, 35, 21, 7, 1),
                Arrays.asList(1, 8, 28, 56, 70, 56, 28, 8, 1),
                Arrays.asList(1, 9, 36, 84, 126, 126, 84, 36, 9, 1)));
        assert(expected.equals(generate));

    }
}
