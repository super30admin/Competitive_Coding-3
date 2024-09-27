//Time : O(n^2)
// Space : O(n)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> innerresult = new ArrayList<>();
        innerresult.add(1);
        res.add(innerresult);
        for (int i = 1; i < numRows; i++) {
            List<Integer> innerresult2 = new ArrayList<>();
            innerresult2 = res.get(i - 1);
            List<Integer> innerresult3 = new ArrayList<>();
            innerresult3.add(1);
            for (int j = 1; j < i; j++) {
                innerresult3.add(innerresult2.get(j - 1) + innerresult2.get(j));
            }

            innerresult3.add(1);
            res.add(innerresult3);
        }
        return res;
    }
}
