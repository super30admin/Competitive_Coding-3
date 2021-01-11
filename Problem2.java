//https://leetcode.com/problems/pascals-triangle/

//Time complexity : O(N!)
//Space complecity : O(N!)
// Did this code successfully run on Leetcode : YES
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int row = 0;

        while (row < numRows) {
            res.add(new ArrayList<>());
            for (int j = 0; j <= row; j++) {
                if (row == 0) {
                    res.get(row).add(1);
                    continue;
                }

                int sum = 0;
                if (j > 0)
                    sum += res.get(row - 1).get(j - 1);
                if (j < res.get(row - 1).size())
                    sum += res.get(row - 1).get(j);

                res.get(row).add(sum);
            }
            row++;
        }
        return res;

    }
}
