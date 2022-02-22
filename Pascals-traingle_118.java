// Time Complexity : O(n^2) where n is num of rows
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
//Keep the track of previous row since it is used to compute the next row
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        list.add(row);
        for(int i=1; i<numRows; i++) {
            row = new ArrayList<>();
            row.add(1);
            for (int j=1; j<i; j++) {
                row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;

    }
}
