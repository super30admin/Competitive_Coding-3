// Time Complexity : O(n * 2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        generateHelper(numRows, result);
        return result;
    }

    private void generateHelper(int numRows, List<List<Integer>> result) {
        if (numRows == 0) {
            return;
        }

        generateHelper(numRows - 1, result);

        List<Integer> newRow = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }

        if (numRows == 1) {
            result.add(newRow);
        } else {
            for (int i = 1; i < numRows - 1; i++) {
                newRow.set(i, result.get(numRows - 2).get(i - 1) + result.get(numRows - 2).get(i));
            }
            result.add(newRow);
        }
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        List<List<Integer>> result = obj.generate(5);
        System.out.println(result);
    }
}
