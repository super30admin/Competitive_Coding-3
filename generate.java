// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    newRow.add(1);
                }
                else {
                    newRow.add(answer.get(i-1).get(j-1) + answer.get(i-1).get(j));
                }
            }
            answer.add(newRow);
        }
        return answer;
    }
}