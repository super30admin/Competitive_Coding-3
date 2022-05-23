//Time Complexity: O(n^2)
////Space Complexity:o(1)
////Did this code successfully run on Leetcode :Yes

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        if (numRows < 1) return res;
        List<Integer> initial = new ArrayList();
        initial.add(1);
        res.add(initial);
        for (int i = 1; i < numRows; i++) {
            List<Integer> cur = new ArrayList();
            List<Integer> prev = res.get(i - 1);
            for (int j = 0; j <= i; j++) {
                int tmp = (j > 0 ? prev.get(j - 1) : 0) + (j < i ? prev.get(j) : 0);
                cur.add(tmp);
            }
            res.add(cur);
        }
        return res;
    }
}