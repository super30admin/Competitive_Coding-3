import java.util.ArrayList;
import java.util.List;
// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Pascal {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(numRows == 0)
            return result;
        
        List<Integer> row = new ArrayList<Integer>();
        
        //loop through all the rows
        for(int i = 0; i < numRows; i++){
            
            //the first element of each row is always 1
            row.add(0, 1);
            
            //loop through the row adding the numbers
            for(int j = 1; j < row.size() - 1; j++){
                row.set(j, row.get(j) + row.get(j + 1));
            }
            
            result.add(new ArrayList<Integer>(row));
        }
        
        return result;
    }
}