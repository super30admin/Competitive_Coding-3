import java.util.*;

// Time: O(n^2), Space: O(n)

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> initialRow = new ArrayList();
        initialRow.add(1);
        ans.add(initialRow);

        for (int i = 1; i<numRows; i++) {
            List<Integer> numbers = new ArrayList();
            numbers.add(1);

            for (int j = 1; j<i; j++) {
                numbers.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }

            numbers.add(1);
            ans.add(numbers);
        }
        return ans;
    }
}