// Time Complexity : O(N^2) where N is number of rows.
// Space Complexity : O(1), we do need a result list of size O(N^2) in worst case, but it is not additional space that we are using.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// An element in pascal's triangle is the sum of the element in same column but previous row and element in previous column
// in previous row. So, to calculate values in a row in the pascal tree for I will need to know/calculate the previous
// row values as well. We can calculate values in ith row from (i-1) the row. In every pascal row, we have 1 as the first as well
// as the last element. To calculate a element at ith row and jth column, I need to sum i-1, j-1 element and i-1, j element.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        result.add(Arrays.asList(1));

        if (numRows == 1) return result;
        result.add(Arrays.asList(1, 1));
        int index = 3;
        while (index <= numRows) {
            List<Integer> values = new ArrayList<>();
            values.add(1);
            for (int i = 1; i < index - 1; i++) {

                int prev = result.get(index - 1 - 1).get(i - 1) + result.get(index - 1 - 1).get(i);
                values.add(prev);
            }
            index++;
            values.add(1);
            result.add(values);
        }

        return result;
    }
}
