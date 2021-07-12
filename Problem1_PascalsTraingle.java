import java.util.ArrayList;
import java.util.List;

// Time Complexity : o(n2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution1 {
    public List<List<Integer>> generate(int numRows) 
    {
        
        
        List<List<Integer>> result=new ArrayList<>();
         
        
        // 1 2 1 row =3 
        for(int row=0;row<numRows;row++)
        {
           List<Integer> temp=new ArrayList<>();
            for(int col=0;col<=row;col++)
            {
                if(col==0||col==row)
                    temp.add(1);
                else
                    temp.add(result.get(row-1).get(col-1)+result.get(row-1).get(col));
            }
            result.add(temp);
        }
        return result;
    }
}
