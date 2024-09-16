// Time Complexity : O(n^2) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Pascal's Triangle
//https://leetcode.com/problems/pascals-triangle/


import java.util.ArrayList;
import java.util.List;

public class Probelm1 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < numRows; i++) {

            List<Integer> l = new ArrayList<>();

            System.out.println("i " + i);
            for (int j = 0; j <= i; j++) {

                if (j == 0) {
                    l.add(1);
                } else if (j == i) {
                    l.add(1);
                } else {
                    l.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(l);

        }
        return list;

    }
}
