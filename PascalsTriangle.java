import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * I initalized the first row and second row.
 * Iterated through each index of the next rows. Initialized values first and last indices of each row as 1.
 * Calculated the remaining values using the formula triangle.get(rowNum - 1).get(index - 1) + triangle.get(rowNum - 1).get(index)
 */
// Time: O(N * (N + 1) / 2) ~= O(N^2); where N = numRows
// Space: O(N) for currentRow inside for loop
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1)); // first row
        if (numRows == 1) {
            return triangle;
        }
        triangle.add(Arrays.asList(1, 1)); // second row
        // Iterate from third row to the end
        for (int rowNum = 2; rowNum < numRows; rowNum ++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1); // first element
            for (int index = 1; index < rowNum; index ++) {
                currentRow.add(index,
                    triangle.get(rowNum - 1).get(index - 1) + triangle.get(rowNum - 1).get(index));
            }
            currentRow.add(1); // last element
            triangle.add(currentRow);
        }
        return triangle;
    }
}