// Time Complexity : o(n^2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        //edge case
        //if(numRows<=0)
        List<Integer> first= new ArrayList<>();
        first.add(1);
        triangle.add(first);
        
        for(int i=1; i<numRows; i++)
        {
            List<Integer> previous=triangle.get(i-1);
            List<Integer> currrow=new ArrayList<>();
            
            currrow.add(1);
            
            for(int j=1; j<i;j++)
            {
                currrow.add(previous.get(j-1)+previous.get(j));
            }
            
            currrow.add(1);
            
            triangle.add(currrow);
            

        }
        return triangle;
    }
}