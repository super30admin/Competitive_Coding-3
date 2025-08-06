// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// This problem is about generating Pascal's Triangle up to `numRows`.
// We iterate from i = 0 to numRows-1 to build each row of the triangle.
// For each row, we add 1 at the start and end.
// Any inner element at position j is the sum of the two elements above it from the previous row:
//      res[i-1][j-1] + res[i-1][j]
// We use a List of Lists to store the entire triangle and return it at the end.



import java.util.ArrayList;
import java.util.*;

public class PascalsTriangle {
    public List<List<Integer>> solve (int numRows){
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    int left = res.get(i-1).get(j-1);
                    int right = res.get(i-1).get(j);
                    row.add(left+right);
                }

            }
            res.add(row);
        }
        return res;
    }

    public static void main(String[]args){
        PascalsTriangle ob = new PascalsTriangle();
        System.out.println(ob.solve(5));
        System.out.println(ob.solve(1));
    }
    
}
