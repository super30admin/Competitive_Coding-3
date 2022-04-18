// Time Complexity : O(n^2) where n is the number of rows.
// Space Complexity : O(1) because no extra space is used for the computation
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j =1;j<i;j++){
                row.add(result.get(result.size()-1).get(j-1)+result.get(result.size()-1).get(j));
            }
            if(i!=0)
                row.add(1);
            result.add(row);
        }
        return result;
    }
}