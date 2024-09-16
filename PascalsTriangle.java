import java.util.ArrayList;
import java.util.List;
// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
The first and last element of every row if 1 so if(i==0||i==rowNo)row.add(1); does that for us.
otherwise the element is sum of previous row's previous column and previous row's current column. 


*/

public class PascalsTriangle{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int rowNo=0;rowNo<numRows;rowNo++)
        {
            List<Integer> row=new ArrayList<>();
            
            for(int i=0;i<=rowNo;i++)
            {
                if(i==0||i==rowNo)
                    row.add(1);
                else {
                    int left=result.get(rowNo-1).get(i-1);
                     int right=result.get(rowNo-1).get(i);
                       row.add(left+right);
                }
                    
            }
            result.add(row);
            
        }
        return result;
    }
    public static void main(String[] args)
    {
       List<List<Integer>> result=generate(5);
       System.out.println(result);


    }
}