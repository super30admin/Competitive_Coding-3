// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer> > triangle = new ArrayList<>();
        
        if (numRows == 0) {
            return triangle;
        }
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> pre_row = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            
            for (int j = 1; j < i; j++) {
                row.add(pre_row.get(j - 1) + pre_row.get(j));
            }
            
            row.add(1);
            triangle.add(row);
        }
        return triangle; 
    }
}