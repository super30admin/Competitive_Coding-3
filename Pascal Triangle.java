// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
       
       List<List<Integer>> result= new ArrayList<>();

       for(int i=1;i<=numRows;i++)
       {
           result.add(generateRow(i));
       }
       return result;
    }

    public List<Integer> generateRow(int rows)
    {
        long ans=1;
       List<Integer> res= new ArrayList<>();
       res.add(1);

       for(int col=1;col<rows;col++)
       {
           ans=ans*(rows-col);
           ans=ans/col;
           res.add((int)ans);
       }
       return res;

    }
}