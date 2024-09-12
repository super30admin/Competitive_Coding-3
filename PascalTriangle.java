// Time Complexity :O(N*2)
// Space Complexity :O(N*2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resTri = new ArrayList<List<Integer>>();
        resTri.add(new ArrayList<Integer>());
        //add 1 to first row in triange
        resTri.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prevRow = resTri.get(i-1);
            //for particular row add 1 as start and last element
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            resTri.add(row);
            
        }
        return resTri;
        
    }
}