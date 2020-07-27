// Time Complexity :O(numRows^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascals= new ArrayList<List<Integer>>();
        
        //edge Case
        
        if(numRows == 0)
            return pascals;
        List<Integer> triangle = new ArrayList<>();
        triangle.add(1);
        pascals.add(triangle);
        
        for(int i=1; i<numRows; i++)
        {
            List<Integer> row= new ArrayList<>();
            
            row.add(1);
            
            for(int j=1; j<i; j++)
            {
                row.add(pascals.get(i-1).get(j-1) + pascals.get(i-1).get(j));
            }
            row.add(1);
            pascals.add(row);
        }
        return pascals;
    }
}