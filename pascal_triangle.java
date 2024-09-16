// Time Complexity : O(numRows^2)
// Space Complexity : O(numRows^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Couldn't solve during interview


// Your code here along with comments explaining your approach
//manipulating lists plays the role here

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        
        for(int i =0; i< numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i) row.add(1);
                else{
                    int left = res.get(i-1).get(j-1);
                    int right = res.get(i-1).get(j);
                    row.add(left+right);
                }
            }
            res.add(row);
        }
        
        return res;
    }
}