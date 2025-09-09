// Time Complexity : O(n^2) -> n = numRows
// Space Complexity : O(1) -> resultant list, auxillary space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // first base case; if user requests zero row, the output is empty
        if(numRows == 0)
            return triangle;
        
        // second base case; if user requests one row, first row is always [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rowNum = 1; rowNum < numRows; rowNum++){
            List<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // Current row first element is always 1.
            currRow.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for(int j = 1; j < rowNum; j++){
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            // Current row last element is always 1
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
    }
}
