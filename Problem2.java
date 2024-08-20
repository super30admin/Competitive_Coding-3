//Time = O(n^2)
//Space = O(n^2)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Create a list to hold all rows of Pascal's Triangle
        List<List<Integer>> triangle = new ArrayList<>();

        // Iterate over the number of rows
        for (int i = 0; i < numRows; i++) {
            // Create a new list to represent the current row
            List<Integer> row = new ArrayList<>();
            
            // The first element of each row is always 1
            row.add(1);
            
            // For rows beyond the first, calculate the internal elements
            for (int j = 1; j < i; j++) {
                // The value is the sum of the two elements above it from the previous row
                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(value);
            }

            // The last element of each row is always 1, but only add if it's not the first row
            if (i > 0) {
                row.add(1);
            }

            // Add the completed row to the triangle
            triangle.add(row);
        }
        
        // Return the complete Pascal's Triangle
        return triangle;
    }
}