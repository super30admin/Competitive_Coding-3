// Time Complexity :o(n ^ 2)
// Space Complexity : o(numRows)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// simple problem, if you spot the pattern.
// dp approach possible
// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer>firstRow = new ArrayList<>();
        firstRow.add(1);
        pascal.add(firstRow);
        for(int i = 1; i < numRows; i++) {
            List<Integer> prevRow = pascal.get(i - 1);
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j = 1; j < i; j++) {
                curRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            curRow.add(1);
            pascal.add(curRow);
        }
        return pascal;
    }
}