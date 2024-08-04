// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j == 0 || j == i) list.add(1);
                else {
                    int leftAbove = res.get(i-1).get(j-1);
                    int rightAbove = res.get(i-1).get(j);
                    list.add(leftAbove + rightAbove);
                }
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println("The pascal triangle for rows " + num + " is: ");
        List<List<Integer>> output = generate(num);
        for (List<Integer> integers : output) {
            System.out.println(integers);
        }
    }
}