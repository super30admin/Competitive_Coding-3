// Time Complexity : O(N * N)  N - number of rows
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr1 = new ArrayList<>();
        if(numRows == 0) return arr1;
        
        arr1.add(new ArrayList<>());
        arr1.get(0).add(1);
        
        for(int i = 1;i < numRows;i++){
            List<Integer> row  = new ArrayList<>();
            List<Integer> prevrow = arr1.get(i - 1);
            
            row.add(1);
            for(int j = 1;j < i;j++){
                row.add(prevrow.get(j - 1) + prevrow.get(j));
            }
            row.add(1);
            
            arr1.add(row);
        }
        return arr1;
    }
}
// Your code here along with comments explaining your approach