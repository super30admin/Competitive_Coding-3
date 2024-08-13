// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// 118. Pascal's Triangle

// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (numRows <= 0) {
            return result;
        }
        
        // Initialize the first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        // Generate subsequent rows
        for (int i = 1; i < numRows; i++) {
            // Create a new row with the size of i + 1
            List<Integer> currentRow = new ArrayList<>();
            // The first element is always 1
            currentRow.add(1);
            
            // Compute the middle elements
            for (int j = 1; j < i; j++) {
                // Use the previous row to compute the current row's values
                int value = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                currentRow.add(value);
            }
            
            // The last element is always 1
            currentRow.add(1);
            
            result.add(currentRow);
        }
        
        return result;
    }
}
