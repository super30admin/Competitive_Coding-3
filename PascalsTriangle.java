// Time Complexity: O(numRows^2)
//   - We generate each row from 1 to numRows
//   - For row i, we compute i elements (except the first and last which are 1)
//   - Total elements across all rows = 1 + 2 + ... + numRows = O(numRows^2)
// Space Complexity: O(numRows^2), We store all rows in a List of Lists

// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach:
// - Initialize the result list with the first row [1].
// - For each subsequent row:
//     - Start with a 1.
//     - Each middle element is computed as the sum of the two elements directly above it in the previous row.
//     - End the row with another 1.
// - Each row is added to the result list.
// - Finally, Return the list of rows as the complete triangle.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //Result
        List<List<Integer>> result = new ArrayList<>();

        //Add first row
        result.add(Arrays.asList(1));

        //Loop for all remaining rows
        for(int i=1; i<numRows; i++){
            //List for a row
            List<Integer> list = new ArrayList<>();

            //Add 1 to the start
            list.add(1);

            //Add all the previous row one by one and add it to the list in the middle
            for(int j=1; j<i; j++){
                list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }

            //Add 1 to the end
            list.add(1);

            //Add the complete list for that row to the result
            result.add(list);

        }
        return result;
    }
}