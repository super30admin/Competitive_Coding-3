import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals {

    // Time complexity: O(n) n is numRows
    // Space complexity: O(n)
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return null;

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for(int i=0; i < numRows; i++) {
           // This will mutate the current list and moves the element to the right
            // So, if previously it was [1], after this line it will be [1,1]
            // Second 1 is from the previous 0th position
            row.add(0,1);

           for(int j = 1; j < row.size() - 1; j++) {
               row.set(j, row.get(j) + row.get(j + 1));
           }
           result.add(new ArrayList<>(row));
        }
        return result;
    }

    public static void main(String[] args) {
        Pascals p =new Pascals();
        p.generate(5);
    }
}
