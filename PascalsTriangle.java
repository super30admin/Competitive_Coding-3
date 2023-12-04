// Time Complexity : O(n power 2)
// Space Complexity : O(1) (Not including result List)
// Did this code successfully run on Leetcode : yes
// Use nested for loops to iterate and calculate numbers of ith row using values of (i-1)th row.

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();

        List li = new ArrayList<Integer>();
        li.add(1);
        res.add(li);

        for(int i=1;i<numRows;i++){
            List l = new ArrayList<Integer>();
            l.add(1);

            for(int j=1;j<i;j++){
                l.add(res.get(i-1).get(j-1)+ res.get(i-1).get(j));
            }
            l.add(i,1);
            res.add(l);
        }
        return res;
    }

    public static void main(String[] args) {
        var res = generate(5);
        for(var i : res){
            for(var j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
