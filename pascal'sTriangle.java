// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO
// Your code here along with comments explaining your approach
/*
 * We calulate values in every row using the previous row and  j-1 and jth term to calculate the value.
 * we need to create a temporary list for every row and after completion of evry row add it to the result list.
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int left = result.get(i - 1).get(j - 1);
                    int right = result.get(i - 1).get(j);

                    list.add(left + right);
                }
            }

            result.add(list);
        }

        return result;
    }
}