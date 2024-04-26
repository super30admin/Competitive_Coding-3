// Time Complexity : O(numRows^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 *
 */
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        output.add(new ArrayList<>());
        //First row is one // base case
        output.get(0).add(1);

        for(int i=1;i<numRows;i++)  {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = output.get(i-1);
            // adding first element
            row.add(1);
            for(int j=i+1;j<i;j++) {
                // summ of current
                int sum = prevRow.get(j-1) + prevRow.get(j);
                row.add(sum);
            }
            // adding last element
            row.add(1);

            output.add(row);
        }
        return output;

    }
}