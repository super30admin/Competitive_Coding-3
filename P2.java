//Pascal's Triangle

// Time Complexity : O(n^2)
// Space Complexity :   O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Initialize the result list to store all rows of Pascal's Triangle
        List<List<Integer>> res = new ArrayList<>();
        
        // Loop through each row from 0 to numRows - 1
        for (int i = 0; i < numRows; i ++) {
            // Initialize the current row as an empty list
            List<Integer> row = new ArrayList<>();
            
            // Loop through each element in the current row
            for (int j = 0; j <= i; j ++) {
                // The first and last elements of each row are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // For other elements, sum the two elements directly above from the previous row
                    int left = res.get(i - 1).get(j - 1);
                    int right = res.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            
            // Add the completed row to the result list
            res.add(row);
        }
        
        return res;
    }
}