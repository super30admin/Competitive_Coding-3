// Time Complexity : O(numrows^2)
// Space Complexity : O(numrows^2)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

public class PascalTree {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i< numRows ; i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j<=i ; j++)
            {
                if(j==0 || j == i)
                {
                    row.add(1);
                }
                else
                {
                    int sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    row.add(sum);
                }
            }
            result.add(row);
        }
        return result;
    }

    public static void main (String[] args)
    {
        PascalTree t = new PascalTree();
        System.out.println(t.generate(5).toString());
    }
}

