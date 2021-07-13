// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//construct each row where first and last elements would be 1 always and inbetween would be previous rows i and i-1 elemet's addition.


import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        List<List<Integer>> res =  generate(3);
        System.out.println("Pascal's Traiangle!" + res);
    }

    public static List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return null;
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList());
        res.get(0).add(1);

        for(int i=1; i<numRows; i++){
            List<Integer> row = new ArrayList();
            row.add(1);

            // logic
            for(int j=1 ; j<i; j++){
                row.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));

            }
            row.add(1);
            res.add(row);
        }

        return res;

    }

}