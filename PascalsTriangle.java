import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    /*
    LC : https://leetcode.com/problems/pascals-triangle/description/
    Approach : if you observe at each row at index >=1 we take the sum of eprevious and same index in the previous row
    TC: O(N^2)
    SC: O(N^2)
    Where N is the number of rows

    */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>() {
            {
                add(1);
            }
        });
        List<Integer> prev = result.get(0);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i ; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }
            row.add(1);
            prev = row;
            result.add(row);
        }
        return result;
    }
}