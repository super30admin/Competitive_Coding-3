import java.util.*; 
// Time complexity - O(N)
// Space complexity - O(N) for the result list, as we are storing each row of Pascal's triangle in a list of lists.

/**
 * Generates Pascal's Triangle up to the specified number of rows.
 * Each row is built based on the sum of adjacent elements from the previous row.
 * Returns a list of lists representing the triangle.
*/

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> rowOne = new ArrayList<>();
        rowOne.add(1);
        result.add(rowOne);

        if (numRows == 1)
            return result;

        int currentRow = 1;

        if (numRows >= 2) {
            List<Integer> rowTwo = new ArrayList<>();
            rowTwo.add(1);
            rowTwo.add(1);
            result.add(rowTwo);
            currentRow++;
        }

        while (currentRow < numRows) {
            currentRow++;
            List<Integer> currentRowList = new ArrayList<>();
            currentRowList.add(1); //first element
            List<Integer> prevRow = result.getLast();

            for (int i = 2; i <= prevRow.size(); i++) {
                int currentElement = prevRow.get(i - 2) + prevRow.get(i-1);
                currentRowList.add(currentElement);

            }
            currentRowList.add(1); // last element
            result.add(currentRowList);
        }
        return result;
    }
}