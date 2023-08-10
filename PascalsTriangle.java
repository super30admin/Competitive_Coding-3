// Time Complexity : O(numRows^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        // Create a list to store the generated Pascal's triangle
        List<List<Integer>> result = new ArrayList<>();

        // Iterate to generate each row of the triangle
        for (int i = 0; i < numRows; i++) {
            // Create a list for the current row
            List<Integer> list = new ArrayList<>();

            // Iterate to generate each element of the row
            for (int j = 0; j < i + 1; j++) {
                // Check if the element is a boundary element
                if (j == 0 || j == i) {
                    list.add(1); // Set the element to 1 for boundary elements
                } else {
                    // Calculate the element by summing the corresponding elements from the previous row
                    int a = result.get(i - 1).get(j - 1);
                    int b = result.get(i - 1).get(j);
                    list.add(a + b);
                }
            }

            // Add the current row to the result
            result.add(list);
        }

        // Return the generated Pascal's triangle
        return result;
    }
}
