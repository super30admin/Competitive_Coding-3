// Time Complexity : O(N^2)
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

import java.util.*;
public class PascalsTriangle{

    public static List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>(numRows);
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList(i));
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(j==0) list.get(i).add(1);
                else if(j==i) list.get(i).add(1);
                else list.get(i).add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
            }
        }
        return list;
    }

    public static void main(String args[])
    {
        List<List<Integer>> answer = generate(5);

        for(List<Integer> li:answer)
        {
            System.out.println(li);
        }
    }

}