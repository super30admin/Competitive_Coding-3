import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            res.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    res.get(i).add(1);
                } else {
                    int med = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    res.get(i).add(med);
                }
            }
        }
        return res;
    }
}
