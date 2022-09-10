// TC - O(n * numRows) where n is all elements in the triangle and numRows is input value for triangle levels
// SC - O(n)

// URL - https://leetcode.com/problems/pascals-triangle/

import java.util.ArrayList;
import java.util.List;

// input -- 5
// output -- [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows <=0){
            return res;
        }
        for (int i=0; i<numRows; i++) {
            List<Integer> row =  new ArrayList<>();
            for (int j=0; j<i+1; j++) {
                // If first or last element of row then it will always be 1
                if (j==0 || j==i) {
                    row.add(1);
                } // all the element in between is addition of previous row element index and previous index
                else {
                    row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            // add row to result list
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(generate(5));
    }
}
