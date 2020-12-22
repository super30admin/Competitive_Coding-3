// Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :  No


// Your code here along with comments explaining your approach: Using DP we add the previous row elements to find the value of the current row
// element. Also we keep 1 when it is the first or the last element of the row.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)
            return new ArrayList<List<Integer>>();
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> value = new ArrayList<>(); 
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    value.add(1);
                else {
                int val = result.get(i-1).get(j-1)+result.get(i-1).get(j);
                    value.add(val);
                }
            }
            result.add(value);
        }
        return result;
    }
}