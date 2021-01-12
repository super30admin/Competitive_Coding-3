import java.util.ArrayList;
import java.util.List;

// Time Complexity :O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : getting started

// Your code here along with comments explaining your approach
public class PascalsTriangle {

    class Solution {
        public List<List<Integer>> generate(int numRows) {


            List<List<Integer>> allValues = new ArrayList<>();
            //edge case
            if(numRows == 0) return allValues;

            //Add first row
            List<Integer> listZero = new ArrayList<>();
            listZero.add(1);
            allValues.add(listZero);

            // loop from 1 to n-1
            for(int i = 1; i<=numRows-1; i++){
                List<Integer> placeHolder = new ArrayList<>();
                List<Integer>prevRow = allValues.get(i-1);

                //add one to start of list
                placeHolder.add(1);
                for(int j = 1; j<i; j++){
                    //compute current value from prevoius row
                    placeHolder.add(prevRow.get(j-1) + prevRow.get(j));
                }
                //add 1 to end of list
                placeHolder.add(1);
                allValues.add(placeHolder);

            }

            return allValues;
        }
    }


}
