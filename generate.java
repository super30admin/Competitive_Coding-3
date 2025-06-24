
/* Approach : To generate Pascal's Triangle, initialize an empty list to store the rows. For each row from 0 to numRows - 1, c
reate a new list and populate it by iterating from 0 to the current row index. Add 1 for the first and last elements of each row. 
For other elements, sum the values directly above and to the left from the previous row. Finally, add the constructed row to the 
result list. This approach ensures each row is built based on the values from the previous row, forming Pascal's Triangle.
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last elements are always 1
                } else {
                    int l = result.get(i - 1).get(j - 1); // Element above and to the left
                    int r = result.get(i - 1).get(j); // Element directly above
                    row.add(l + r); // Sum of the two elements
                }
            }
            result.add(row); // Add the row to the result
        }
        return result;
    }
}
