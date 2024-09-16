package S30.CompetitiveCoding_3;


// Time Complexity : O(numRows*numRows+1) --> O(n^2) solution
// Space Complexity : O(1) -- only auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;

        for(int i = 0; i < numRows; i++){
            List<Integer> level = new ArrayList<Integer>();
            level.add(1);
            for(int j = 1; j < i; j++){
                level.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            if(i > 0) level.add(1);
            result.add(level);
        }

        return result;
    }
}
