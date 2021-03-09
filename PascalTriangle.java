// the first and last element in each row will contain 1. And to populate the remaining element in each row, we just need to take sum 
// of elements from the elements from the row before the current row. 

// Time Complexity : O(numRows ^ 2)
// Space Complexity L O(numRow ^ 2)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allRows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            allRows.add(new ArrayList<Integer>(row));
        }
        return allRows;
    }

    public static void main(String[] args) {

        PascalTriangle pascalTriangle = new PascalTriangle();

        List<Integer> input = new ArrayList<>();
        Collections.addAll(input, 5, 1, 4, 6);

        for (int n : input) {
            List<List<Integer>> triangle = pascalTriangle.generate(n);

            for (List<Integer> l : triangle) {
                System.out.println(l.toString());
            }
            System.out.println();
        }
    }
}