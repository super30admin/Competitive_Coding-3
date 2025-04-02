import java.util.ArrayList;
import java.util.List;
// Time Complexity : O(n2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/*
This code generates Pascal’s Triangle by iteratively building each row based on the previous one.
It starts with the first row containing [1] and constructs subsequent rows by adding adjacent values
from the previous row. Each row begins and ends with 1, while the middle elements are computed as the
sum of two numbers directly above. The approach runs in O(n2) time complexity,
 as each row requires iterating through the previous row.
 This method efficiently constructs Pascal’s Triangle in a structured and intuitive manner.
* */
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        if(numRows==0)
            return ans;

        List<Integer> temp=new ArrayList<Integer>();
        temp.add(1);
        ans.add(temp);

        for(int i=1;i<numRows;i++)
        {
            temp=new ArrayList<Integer>();
            List<Integer> prevRow=ans.get(i-1);
            temp.add(1);
            for(int j=1;j<prevRow.size();j++)
            {
                temp.add(prevRow.get(j-1)+prevRow.get(j));
            }
            temp.add(1);
            ans.add(temp);
        }


        return ans;
    }
}