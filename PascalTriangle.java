// Time Complexity :O(nm) => where n is number of rows and m is number pof terms in last row.
// Space Complexity :O(nm) but it can be also called as O(1) since we are have to return the list<list> over here
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
import java.util.*;



public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        //edge case
        if(numRows==0) return output;
        
        output.add(Arrays.asList(1));
        for(int i = 1 ; i <numRows;i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            int j = 0;
            while(j+1<output.get(i-1).size())
            {
                temp.add(output.get(i-1).get(j)+output.get(i-1).get(j+1));
                j++;
            }
            temp.add(1);
            output.add(temp);
        }
        return output;
    }
    public static void main(String [] args)
    {
        System.out.println(new PascalTriangle().generate(6));
    }

}