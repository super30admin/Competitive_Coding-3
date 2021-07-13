// Time complexity: O(numRows^2)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

class Solution1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>(); 
        
        if(numRows < 0) return output; 

        // add the first row
        output.add(Arrays.asList(1));
        
        for(int i=1; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // the first and last element would be 1. 
                if(j == 0 || j == i) {
                    row.add(1);
                }
                else {
                    // calculate the value from previous rows. 
                    row.add(output.get(i-1).get(j-1) + output.get(i-1).get(j)); 
                }
            }
            output.add(row); 
        }
        
        return output;
    }
}