// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Making list for each row of the triangle. Iterating the previous row to form the next row and adding to the final result

import java.util.ArrayList;
import java.util.List;


public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0){
            return result;
        }

        if(numRows==1){
            List<Integer> r1 = new ArrayList<>();
            r1.add(1);
            result.add(r1);
            return result;
        }

        List<Integer> r1 = new ArrayList<>();
        r1.add(1);
        // List<Integer> r2 = new ArrayList<>();
        // r2.add(1);
        // r2.add(1);

        result.add(r1); //<1>
        //result.add(r2);

        for(int i =1; i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> previous = result.get(i-1); //<1>
            row.add(1); //<1.>

            for(int j=1; j<i; j++){
                int sum = previous.get(j) + previous.get(j-1);
                row.add(sum);
            }
            row.add(1); //<1,1>

            result.add(row);
        }

        return result;
    }
}
