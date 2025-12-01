// Time Complexity : O(numRows^2) -> Two for loops each running for 'numRows=5' iterations
// Space Complexity : O(1) -> Output list created is returned as an output so no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Create output List of Lists
        List<List<Integer>> result = new ArrayList<>();

        // 'i' pointer - for each row
        for(int i = 0; i < numRows; i++){
            // Create a list for each row
            List<Integer> row = new ArrayList<>();
            // 'j' pointer to fill all the columns in each row
            for(int j = 0; j <= i; j++){
                // first and last columns in each row will be filled with 1
                if(j == 0 || j == i){
                    row.add(1);
                }
                // All middle columns will be sum of two numbers directly above it in the previous row
                else{
                    int prev = result.get(i-1).get(j-1);
                    int next = result.get(i-1).get(j);
                    // Get both numbers and add sum to the row for that column
                    row.add(prev+next);
                }

            }
            // Add each row(list 'row') to the result list
            result.add(row);         
        }
        // Return list of lists
        return result; 
    }
}