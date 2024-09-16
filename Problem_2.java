// Time Complexity : O(n^2) n is the numRows
// Space Complexity :O(n^2) n is the numRows
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :No

// DP : use prev array to create each array
// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(numRows==0) return result;
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for(int i =1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow= new ArrayList<>();
            prevRow= result.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++){
               row.add(prevRow.get(j-1)+prevRow.get(j)); 
            }
            row.add(1);
            result.add(row);
        }
        
        
        return result;
    }
}