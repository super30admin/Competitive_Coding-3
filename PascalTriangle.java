
//Time complexity - O(N^2)
// Space Complexity - O(1)


import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> all_rows = new ArrayList<List<Integer>>(); //result
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1); //add element 1 at index 0.
            System.out.println("First Element" + " " + i);
            System.out.println("Row size" + " " + row);
//            //now iterate the row, keep adding elements in pair, starting from j=1,
//            // and set the sum at index j
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
                System.out.println( "inside for loop" + row);
            }

            //create a copy of row and store it in all_rows
            all_rows.add(new ArrayList<Integer>(row));
        }
        return all_rows;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = pascalTriangle(6);
        for (int i = 0; i < result.size(); i++) {
            List<Integer> current = result.get(i);
            System.out.println(Arrays.toString(current.toArray()));
        }
    }
}