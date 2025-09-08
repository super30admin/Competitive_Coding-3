// Time Complexity : O(n*n)  
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
We create an arraylist to store the current row values and iterate over the column
Since the start and end of the triangle is 1 we insert value 1 when column is 0 or if its reach row value
The values other than the edges of the triangle is calculated by summing the values in the previous row and prev column and prev row and current column
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currRow = new ArrayList<>();
            //for each colums 
            for (int col = 0 ; col <= row; col++) {
                //for the first and the last column insert 1
                if (col == 0 || col == row) {
                    currRow.add(1);
                } else {
                    int val = triangle.get(row-1).get(col-1) + triangle.get(row-1).get(col);
                    currRow.add(val);
                }
            }
            triangle.add(currRow);
        }
        return triangle;
        
    }
}
