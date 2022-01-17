import java.util.ArrayList;
import java.util.List;

public class S30_E_118_PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int i = 1; i<numRows; i++){ // T.C - O(N^2)
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previousRow = triangle.get(i-1);
            currentRow.add(1);
            for(int col = 1; col<previousRow.size(); col++){
                currentRow.add(previousRow.get(col-1) + previousRow.get(col));
            }
            currentRow.add(1);

            triangle.add(currentRow);
        }

        return triangle;
    }
}

