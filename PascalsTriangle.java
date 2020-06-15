// Time Complexity : O(numRows^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : calculate each row, for any row > 1, first and last element is always 1


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(numRows == 0) return result;
        
        result.add(Arrays.asList(1));
        
        for(int i=1; i<numRows; i++) {
            List<Integer> currRow = new ArrayList<Integer>();
            List<Integer> prevRow = result.get(i-1);
            
            //first element is always 1
            currRow.add(1);
            
            for(int j=1; j<i; j++) {
               currRow.add(prevRow.get(j-1) +  prevRow.get(j));
            }
             
            //last element is always 1
            currRow.add(1);
            result.add(currRow);
        }
        
        return result;
    }
}