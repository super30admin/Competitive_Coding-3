// Time Complexity :O(n) - number of rows
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal = new ArrayList<>();
        
        if(numRows==0)
            return pascal;
        
        pascal.add(new ArrayList<Integer>());
        pascal.get(0).add(1);
        
        for(int i=1;i<numRows;i++)
        {
            List<Integer> r = new ArrayList<>();
            List<Integer> prev = pascal.get(i-1);
            
            r.add(1);
            
            for(int j=1;j<i;j++)
            {
                r.add(prev.get(j-1)+prev.get(j));
            }
            
            r.add(1);
            
            pascal.add(r);
        }
        
        return pascal;
    }
}