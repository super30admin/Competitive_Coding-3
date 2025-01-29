import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//118. Pascal's Triangle
//TC: O(m*n)
class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            Integer[] temp = new Integer[i + 1];
            Arrays.fill(temp, 1);
            result.add(Arrays.asList(temp));
        }
        for (int i = 2; i < numRows; ++i) {
            for (int j = 1; j < result.get(i).size() - 1; ++j) {
                int prev1 = result.get(i - 1).get(j - 1);
                int prev2 = result.get(i - 1).get(j);
                result.get(i).set(j, prev1 + prev2);
            }
        }
        return result;
    }
}