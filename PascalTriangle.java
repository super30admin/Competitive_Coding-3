import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity: O(n ^ 2) as the outside loop is used to iterate till numRows and inner loop is used to get the sum.
// Space Complexity: O(1). Code expects to return 2d list. So any data structure less or equal to space of 2d list should be O(1)

// This is a DP problem where the formula of the current sum depends on the elements above it.
public class PascalTriangle {

    public static void main(String[] args) {
        for (List<Integer> triangle : generate(5)) { // [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
            System.out.println(triangle);
        }
        for (List<Integer> triangle : generate(1)) { // [[1]]
            System.out.println(triangle);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 1) {
            result.add(Arrays.asList(1));
            return result;
        }
        if (numRows == 2) {
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1, 1));
            return result;
        }
        if (numRows > 2) {
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1, 1));
        }
        for (int row = 3; row <= numRows; row++) {
            List<Integer> current = new ArrayList<>();
            for (int col = 0; col < row; col++) {
                List<Integer> temp = result.get(row - 2);
                if (col > 0 && col < row - 1)
                    current.add(temp.get(col - 1) + temp.get(col));
                else
                    current.add(1);
            }
            result.add(current);
        }
        return result;
    }

}