// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Construct the first row as [1]
// For each subsequent rows, initialize the first and last element as 1
// calculate the rest elements of a row by adding above two elements.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
        List<List<Integer>> result = new ArrayList<>();
        
        result.add(Arrays.asList(1));
        
        if (numRows == 1) {
            return result;
        }
        
        for (int i=2;i<=numRows;i++) {
            List<Integer> currRow = new ArrayList<>(i);
            
            for (int j=0;j<i;j++) {
                
                if (j == 0) {
                    currRow.add(1);
                } else if (j == i-1) {
                    currRow.add(1);
                } else {
                    int value = result.get(i-2).get(j-1) + result.get(i-2).get(j);
                    currRow.add(value);
                }
            }
            
            result.add(currRow);
        }
        
        return result;
    }
}