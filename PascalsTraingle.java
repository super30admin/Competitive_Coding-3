// Time Complexity : O(n^2) - n = no of orws
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        
        result.add(new ArrayList<>());
        result.get(0).add(1);
        
        
        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList();
            List<Integer> prev_row = result.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            
            row.add(1);
            result.add(row);
        }
        return result;
    }
}