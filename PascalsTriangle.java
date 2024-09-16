//https://leetcode.com/problems/pascals-triangle/
// Time Complexity :O(n)  
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output=new ArrayList<>();
        
        if(numRows==1 || numRows>1)
        {
            List<Integer> result=new ArrayList<Integer>();
            result.add(1);
            output.add(result);
        }
        if(numRows==2 || numRows>2)
        {
            List<Integer> result=new ArrayList<Integer>();
            result.add(1);
            result.add(1);
            output.add(result);
        }
        for(int row=3;row<=numRows;row++)
        {
            List<Integer> prev=output.get(row-2);
            int count=1;
            List<Integer> cur=new ArrayList<>();
            cur.add(1);
            int i=0;
            while(count<row-1)
            {
                cur.add(prev.get(i)+prev.get(i+1));
                i=i+1;
                count++;
            }
            cur.add(1);
            output.add(cur);
        }
        return output;
    }
}