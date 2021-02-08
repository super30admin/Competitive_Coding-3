// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
//Dynamic programming starting with 1 and keep on adding previos rows j and j-1 values.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out= new ArrayList<List<Integer>>();
        if(numRows==0) return out;
        
        out.add(new ArrayList<>());
        out.get(0).add(1);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> curr= new ArrayList<>(i);
            List<Integer> prev= out.get(i-1);
            curr.add(1);
            for(int j=1;j<i;j++)
            {
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            out.add(curr);
            
        }
        return out;       
        
    }
}