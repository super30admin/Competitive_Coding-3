// Time Complexity :o(n^2)
// Space Complexity :o(n^2)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


import java.util.*;

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int row = 1; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1); // First element is always 1

            for (int col = 1; col < row; col++) {
                int aboveLeft = triangle.get(row - 1).get(col - 1);
                int aboveRight = triangle.get(row - 1).get(col);
                currentRow.add(aboveLeft + aboveRight);
            }

            currentRow.add(1); // Last element is always 1
            triangle.add(currentRow);
        }

        return triangle;
    }
}


