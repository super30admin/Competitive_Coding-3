// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
// One loop until the given num
// and get previous row to calculate the new row
// adding 1 a beginin and in the end of each row
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows ==0)
            return res;
        
        res.add(new ArrayList<>());
        res.get(0).add(1);
        
        for(int i=1; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = res.get(i-1);
            
            row.add(1);
            for(int j=1; j< i; j++){
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            
            res.add(row);
        }
        return res;
    }
}