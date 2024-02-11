// https://leetcode.com/problems/pascals-triangle/

// Time Complexity : O(N^2), where N is the number of rows
// Space Complexity : O(1) since no auxilliary space used
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Output
        List<List<Integer>> pascal=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> currRow=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    // Elements at edges, always 1
                    currRow.add(1);
                }else{
                    // Get elements directly above and sum
                    currRow.add(pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
                }
            }
            pascal.add(currRow);
        }

        return pascal;
    }
}
