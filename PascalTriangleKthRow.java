// Time Complexity : O(N^2) where N is number of rows.
// Space Complexity : O(N), at any recursion call, we need to keep N values in an array list
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// An element in pascal's triangle is the sum of the element in same column but previous row and element in previous column
// in previous row. So, to calculate values in a row in the pascal tree for I will need to know/calculate the previous
// row values as well. We can calculate values in ith row from (i-1) the row. In every pascal row, we have 1 as the first as well
// as the last element. To calculate a element at ith row and jth column, I need to sum i-1, j-1 element and i-1, j element.
// The recursion call for Nth row, will calculate for element values from N-1 row, n-2 row... 1st row. The recursion call
// returns when only 1 value for row 1.

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleKthRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        if (rowIndex == 0) {
            result.add(1);
            return result;
        }

        return getPascalRow(rowIndex);
    }

    public List<Integer> getPascalRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            return temp;
        }

        List<Integer> prevRow = getPascalRow(rowIndex - 1);
        int len = rowIndex + 1;
        List<Integer> temp = new ArrayList<>();

        temp.add(1);
        for (int i = 1; i < len - 1; i++) {
            temp.add(prevRow.get(i - 1) + prevRow.get(i));
        }
        temp.add(1);

        return temp;
    }
}
