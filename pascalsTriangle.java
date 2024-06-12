// https://leetcode.com/problems/pascals-triangle/
// Time Complexity :O(nˆ2)
// Space Complexity : 1 if auxiliary space is neglected . Auxiliary space O(nˆ2).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//
// Your code here along with comments explaining your approach
// 1 . For each row if elements are extremes then add 1 to list.
// 2 . Else add sum of top adjacent elements of previous row (i.e previous list's i-1th item and ith item in previous list).
import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static void main(String[] args) {
        System.out.print(pascalstriangle(4));
    }

    private static List<List<Integer>> pascalstriangle(int row) {
        //      1
        //   1     1
        //1     2      1
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i<row;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<= i;j++){
                if(j == 0 || j == i ){
                    // extremes
                    list.add(1);
                }
                else{
                    // add previous lists two top numbers
                    int sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    list.add(sum);
                }
            }
            result.add(list);
        }
        return result;

    }
}
