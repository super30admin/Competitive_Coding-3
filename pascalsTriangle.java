// Time complexity = O(n^2)
// Space complexity = O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Logic: We create a for loop to fill the number of rows, and another for loop to fill the colomns in each row, add 1 to the start and end of each row
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        for (int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<i+1; j++) {
                if (j==0 || j==i) {
                    row.add(1);
                }
                else {
                    row.add(triangle.get(i-1).get(j) + triangle.get(i-1).get(j-1));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }
}