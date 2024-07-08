// Time Complexity : o(N)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Initialize the result list to store the rows of Pascal's triangle
        List<List<Integer>> result = new ArrayList<>();

        // Loop through each row from 1 to numRows
        for (int i = 1; i <= numRows; i++) {
            // Initialize the list to store the current row
            List<Integer> list = new ArrayList<>();
            
            // Initialize the first element of each row as 1
            int comb = 1;
            list.add(comb);

            // Loop to calculate the remaining elements of the current row
            for (int j = 1; j < i; j++) {
                // Calculate the combination value using the previous combination value
                comb = comb * (i - j) / j;
                list.add(comb);
            }

            // Add the current row to the result list
            result.add(list);
        }

        return result;
    }

    
    
}
