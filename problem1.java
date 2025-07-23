//Time Complexity: O(n²) — Because the total number of elements generated is 1 + 2 + 3 + ... + n = n(n + 1)/2 = O(n²)
//Space Complexity: O(n²) — You are storing all rows up to n, and total number of elements is also O(n²)

//Initialize the first row of Pascal’s Triangle as [1].
//For each new row, compute values by adding adjacent values from the previous row.
//Append 1 at the start and end of each row, and add it to the result list.

class Solution {
    public List<List<Integer>> generate(int totalRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1));  // First row is always [1]
        
        for (int rowIndex = 1; rowIndex < totalRows; rowIndex++) {
            List<Integer> previousRow = triangle.get(rowIndex - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);  // First element is always 1
            
            for (int colIndex = 1; colIndex < previousRow.size(); colIndex++) {
                int value = previousRow.get(colIndex - 1) + previousRow.get(colIndex);
                currentRow.add(value);
            }

            currentRow.add(1);  // Last element is always 1
            triangle.add(currentRow);
        }

        return triangle;
    }
}
