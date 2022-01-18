import java.util.ArrayList;
import java.util.List;

//TC O(N^2)
// SC O(1) 
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> inner = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    inner.add(1);
                } else {
                    List<Integer> prev = res.get(i - 1);
                    inner.add(prev.get(j - 1) + prev.get(j));
                }
            }
            res.add(inner);
        }
        return res;
    }
}
