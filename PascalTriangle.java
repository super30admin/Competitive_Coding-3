
// Time Complexity : O(N^2)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
/*Approach
1) for calculating the values in recent row, we add up the value from previous row and fetch the i-1 value and also the next value
2) this can be used as lst.get(i-1) -> previous row lst.get(i-1).get(j-1) -> j-1 value from previous row.
3) same for right and we can get (i-1).get(j) the current value

*/

import java.util.*;

class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        
       List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0;i<numRows;i++)
        {
            List<Integer> ans = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    ans.add(1);// add the number 1
                    
                }
                else
                {
                    int left = res.get(i-1).get(j-1);
                    int right = res.get(i-1).get(j);
                    ans.add(left+right);
                }
            }
            res.add(ans);
        }
        
        
        return res;
    }

    public static void main(String args[])
    {
        List<List<Integer>> output = generate(5);
        System.out.println(output);
    }
}