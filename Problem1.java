import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

// Time Complexity : O(N*N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Create first row. Use two loops to get data for each row from the data of the
//previous row

class Problem1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pasList = new ArrayList<>();
        pasList.add(new ArrayList(Arrays.asList(1)));

        for(int i=1;i<numRows;i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            row.add(1);

            for(int j=1;j<i;j++){

                int sum =  pasList.get(i-1).get(j-1)+pasList.get(i-1).get(j);
                row.add(sum);

            }
            row.add(1);
            pasList.add(row);
        }


        return pasList;
    }
}