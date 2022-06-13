// Time Complexity: O(n^2)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

import java.util.ArrayList;
import java.util.List;

public class pascaleTri {

    public static List<List<Integer>> getPascalTri(int num) {
        List<List<Integer>> allRows = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            ArrayList<Integer> row = new ArrayList<>(i+1);

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int a = allRows.get(i-1).get(j-1);
                    int b = allRows.get(i-1).get(j);
                    row.add(a+b);
                    
                }
            }
            allRows.add(row);
        }
        return allRows;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(getPascalTri(5));
    }
}