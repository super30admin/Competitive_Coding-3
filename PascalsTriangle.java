// Time Complexity : O(n^2) where  n is inputRows
// Space Complexity : O(1) no extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*Approach
 * The idea to solve the problem is to develop the new row looking at the previous row.
 * For each new row, we add 1 in the beginning and end of the row.
 * Remaining elements we calculate by taking the sum of the elements from the same index and previous index
 * of the previous row
 * */


import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        //edge
        if(numRows==0) return result;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);

        for(int i=1; i<numRows; i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> newList = new ArrayList<>();
            newList.add(1);

            for(int j=1; j<prevRow.size(); j++){
                newList.add(prevRow.get(j)+prevRow.get(j-1));
            }

            newList.add(1);
            result.add(newList);
        }

        return result;
    }
}
