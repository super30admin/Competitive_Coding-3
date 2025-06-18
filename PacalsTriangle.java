// Time Complexity : O(n^2) where n is the number of rows
// Space Complexity : O(n^2) where n is the number of rows
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach - My approach is the basic of pascal triangle. I first added a single list of 1, then
// for th number of rows i started to generate each row with the help of previous row and added the 1
// at front and the last explicitly and for other element in between I added the number of the previous position
// and that position from the last row and added to the new row
import java.util.*;
public class PacalsTriangle {
    static List<List<Integer>> result = new ArrayList<>();
    static List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        for(int i = 1; i < numRows; i++) {
            generateTree(i);
        }
        return result;
    }
    static  void generateTree(int r) {
        List<Integer> prev = result.get(r-1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i = 1; i < r; i++) {
            int val = (prev.get(i-1) + prev.get(i));
            row.add(val);
        }
        row.add(1);
        result.add(row);
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
