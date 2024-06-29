// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) { // start and end index
                    list.add(1); // keep ends as 1
                } else {
                    int left = res.get(i - 1).get(j-1); // upper row j-1 th element
                    int right = res.get(i - 1).get(j); // upper row j th element
                    list.add(left + right); // adding the upper elements
                }
            }
            res.add(list); // adding each row computation to the resultant list
        }
        return res;
    }
}