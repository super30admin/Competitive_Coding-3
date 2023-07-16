// Time Complexity : O(numRow^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
//List of list is created based on pascle triangle pattern. Current row is created by adding up the elements in the previous row.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> previousRow = triangle.get(i-1);
            for(int j=1;j<i;j++){
                row.add(previousRow.get(j-1)+previousRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}